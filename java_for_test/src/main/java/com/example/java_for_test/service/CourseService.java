package com.example.java_for_test.service;

import org.springframework.stereotype.Service;

import com.example.java_for_test.vo.CourseRequest;
import com.example.java_for_test.vo.CourseResponse;
import com.example.java_for_test.vo.SearchCourseRequest;
import com.example.java_for_test.vo.SearchCourseResponse;

@Service
public interface CourseService {
	public CourseResponse chooseCourse(CourseRequest req);

	public CourseResponse pickAndDropCourse(CourseRequest req);

	public CourseResponse addNewCourse(CourseRequest req);

	public CourseResponse deleteCourse(CourseRequest req);

	public CourseResponse addNewStudent(CourseRequest req);

	public CourseResponse deleteStudent(CourseRequest req);

	public SearchCourseResponse searchStudentCourse(SearchCourseRequest req);

	public SearchCourseResponse searchCourseByCode(SearchCourseRequest req);

	public SearchCourseResponse searchCourseByName(SearchCourseRequest req);

}
