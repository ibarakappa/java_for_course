package com.example.java_for_test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "course_code")
	private String courseCode;
	@Column(name = "course_name")
	private String courseName;
	@Column(name = "course_week")
	private Integer week;
	@Column(name = "course_start_time")
	private Integer startTime;
	@Column(name = "course_end_time")
	private Integer endTime;
	@Column(name = "course_credit")
	private Integer credit;

	public String getCode() {
		return courseCode;
	}

	public void setCode(String code) {
		this.courseCode = code;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

}
