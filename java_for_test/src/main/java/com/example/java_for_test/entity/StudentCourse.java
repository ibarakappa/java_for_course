package com.example.java_for_test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.example.java_for_test.entity.StudentCourse.StudentCourseId;

@Entity
@IdClass(StudentCourseId.class)
@Table(name = "student_course")
public class StudentCourse {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "course_code")
	private String courseCode;
	@Id
	@Column(name = "student_number")
	private int number;
	@Column(name = "student_credit")
	private int credit;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public static class StudentCourseId {
		private static final long serialVersionUID = 1L;
		private String courseCode;
		private int number;

		public String getCourseCode() {
			return courseCode;
		}

		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

	}
}
