package com.example.java_for_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java_for_test.entity.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {
	Course findByCourseCode(String code);

	boolean existsByCourseCode(String Code);
}
