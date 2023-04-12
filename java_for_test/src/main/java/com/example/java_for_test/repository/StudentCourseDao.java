package com.example.java_for_test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java_for_test.entity.StudentCourse;
import com.example.java_for_test.entity.StudentCourse.StudentCourseId;

public interface StudentCourseDao extends JpaRepository<StudentCourse, StudentCourseId> {
	List<StudentCourse> findByNumber(int number);

}
