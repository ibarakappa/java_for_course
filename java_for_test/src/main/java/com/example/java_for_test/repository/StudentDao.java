package com.example.java_for_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java_for_test.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

	boolean existsByNumber(Integer number);

}
