package com.example.java_for_test.service;

import java.util.ArrayList;
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
		// 設定重複修同一堂課的防呆

		if (checkNumber(req)) {
			return new CourseResponse("學號錯誤");
		}
		int studentCredit = credit(req);
		if (studentCredit > 10) {
			return new CourseResponse("您的學分已超過10");
		}
		int chooseCredit = studentCredit;
		List<StudentCourse> student = new ArrayList<StudentCourse>();
		List<StudentCourse> overChoose = new ArrayList<StudentCourse>();
		for (String course : req.getCourseCode()) {
			if (!courseDao.existsByCourseCode(course)) {
				return new CourseResponse("課程代碼錯誤");
			}

			Course lesson = courseDao.findByCourseCode(course);
			studentCredit += lesson.getCredit();
			if (chooseCredit > 10) {
				return new CourseResponse("選修的學分已超過10");
			}
			StudentCourse studentCourse = new StudentCourse(lesson.getCode(),
					req.getNumber(), lesson.getCourseName(), lesson.getCredit());
			if (studentCourseDao.findByNumber(req.getNumber()).contains(studentCourse)) {
				overChoose.add(studentCourse);
				continue;
			}
			student.add(studentCourse);

		}
		studentCourseDao.saveAll(student);
		if (!overChoose.isEmpty()) {
			return new CourseResponse("選課成功但有重複選課", student);
		}
		return new CourseResponse("選課成功", student);
//		選課成功
	}

	@Override
	public CourseResponse addOrDrop(CourseRequest req) {
		// TODO Auto-generated method stub
		if (checkNumber(req)) {
			return new CourseResponse("學號錯誤");
		}
		if (credit(req) > 10) {
			return new CourseResponse("選修的學分已超過10");
		}

		return null;
	}

	public boolean checkNumber(CourseRequest req) {
		return studentDao.existsByNumber(req.getNumber());

	}

	public int credit(CourseRequest req) {
		List<StudentCourse> allCredit = studentCourseDao.findByNumber(req.getNumber());
		int studentCredit = 0;
		for (StudentCourse course : allCredit) {
			studentCredit += course.getCredit();
		}
		return studentCredit;
	}

}
