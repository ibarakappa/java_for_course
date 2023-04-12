package com.example.java_for_test.service;

import org.springframework.stereotype.Service;

import com.example.java_for_test.vo.CourseRequest;
import com.example.java_for_test.vo.CourseResponse;

@Service
public interface CourseService {
	public CourseResponse chooseCourse(CourseRequest req);
}
