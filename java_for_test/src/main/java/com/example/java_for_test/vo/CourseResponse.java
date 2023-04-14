package com.example.java_for_test.vo;

import java.util.List;

import com.example.java_for_test.entity.Course;
import com.example.java_for_test.entity.StudentCourse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CourseResponse {
	@JsonProperty("系統訊息")
	private String message;
	@JsonProperty("課程:")
	private String lesson;
	@JsonProperty("課程清單")
	private List<StudentCourse> list;
	private List<Course> courselist;

	public CourseResponse(String message, String lesson) {
		super();
		this.message = message;
		this.lesson = lesson;
	}

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

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public List<Course> getCourselist() {
		return courselist;
	}

	public void setCourselist(List<Course> courselist) {
		this.courselist = courselist;
	}

}
