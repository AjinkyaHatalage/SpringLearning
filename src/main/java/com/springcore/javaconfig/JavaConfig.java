package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosaS() {
		return new Samosa();
	}

	@Bean
	public Student getStudents() {
		// creating new object of student
		Student student = new Student(getSamosaS());
		return student;
	}
}
