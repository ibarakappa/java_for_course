package com.example.java_for_test.vo;

import java.util.ArrayList;
import java.util.List;

import com.example.java_for_test.entity.StudentCourse;

public class CourseResponse {
	String message;
	List<StudentCourse> list = new ArrayList<StudentCourse>();

	public CourseResponse(String message, List<StudentCourse> list) {
		super();
		this.message = message;
		this.list = list;
	}

	public CourseResponse(String message) {
		super();
		this.message = message;
	}

	public CourseResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<StudentCourse> getList() {
		return list;
	}

	public void setList(List<StudentCourse> list) {
		this.list = list;
	}

}
