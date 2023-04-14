package com.example.java_for_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_for_test.service.CourseService;
import com.example.java_for_test.vo.CourseRequest;
import com.example.java_for_test.vo.CourseResponse;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@PostMapping("/choose_Course")
	public CourseResponse chooseCourse(@RequestBody CourseRequest req) {
		return courseService.chooseCourse(req);
	}

	@PostMapping("/pick_And_Drop_Course")
	public CourseResponse pickAndDropCourse(@RequestBody CourseRequest req) {
		return courseService.pickAndDropCourse(req);
	}

	@PostMapping("/add_New_Course")
	public CourseResponse addNewCourse(@RequestBody CourseRequest req) {
		return courseService.addNewCourse(req);
	}

	@PostMapping("/delete_Course")
	public CourseResponse deleteCourse(@RequestBody CourseRequest req) {
		return courseService.deleteCourse(req);
	}

}
