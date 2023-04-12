package com.example.java_for_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_for_test.entity.Course;
import com.example.java_for_test.entity.StudentCourse;
import com.example.java_for_test.repository.CourseDao;
import com.example.java_for_test.repository.StudentCourseDao;
import com.example.java_for_test.repository.StudentDao;
import com.example.java_for_test.vo.CourseRequest;
import com.example.java_for_test.vo.CourseResponse;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	StudentDao studentDao;
	@Autowired
	CourseDao courseDao;
	@Autowired
	StudentCourseDao studentCourseDao;

	@Override
	public CourseResponse chooseCourse(CourseRequest req) {
		if (!studentDao.existsByNumber(req.getNumber())) {
			return null;
			// 之後補寫回傳"學號錯誤"
		}
		List<StudentCourse> allCredit = studentCourseDao.findByNumber(req.getNumber());
		int totalCredit = 0;
		for (StudentCourse course : allCredit) {
			totalCredit += course.getCredit();
		}
		if (totalCredit > 10) {
			return null;
			//// 之後補寫回傳學分已超過10
		}

		for (String course : req.getCourseCode()) {
			if (!courseDao.existsByCourseCode(course)) {
				return null;
			}
			// 之後補寫回傳 "沒有這堂課"or"課程代碼錯誤"
			Course lesson = courseDao.findByCourseCode(course);
			totalCredit += lesson.getCredit();
			if (totalCredit > 10) {
				return null;
				//// 之後補寫回傳"學分已超過10"
			}
			StudentCourse student = new StudentCourse(lesson.getCode(), req.getNumber(),
					lesson.getCredit());
			studentCourseDao.save(student);
		}
		return new CourseResponse("選課成功");
//		選課成功
	}

}
