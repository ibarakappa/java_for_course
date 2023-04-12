package com.example.java_for_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.java_for_test.repository.StudentDao;

@SpringBootTest
class JavaForTestApplicationTests {

	@Autowired
	StudentDao studentDao;

	@Test
	public void getStudents() {

	}
}
