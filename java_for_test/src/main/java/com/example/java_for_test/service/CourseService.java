package com.example.java_for_test.service;

import org.springframework.stereotype.Service;

import com.example.java_for_test.vo.CourseRequest;
import com.example.java_for_test.vo.CourseResponse;

@Service
public interface CourseService {
	public CourseResponse chooseCourse(CourseRequest req);

	public CourseResponse pickAndDropCourse(CourseRequest req);

	public CourseResponse addNewCourse(CourseRequest req);

	public CourseResponse deleteCourse(CourseRequest req);

	public CourseResponse addNewStudent(CourseRequest req);

	public CourseResponse deleteStudent(CourseRequest req);

}
