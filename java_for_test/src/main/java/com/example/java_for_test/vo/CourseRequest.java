package com.example.java_for_test.vo;

import java.util.List;

public class CourseRequest {
	public Integer number;
	public List<String> courseCode;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<String> getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(List<String> courseCode) {
		this.courseCode = courseCode;
	}

}
