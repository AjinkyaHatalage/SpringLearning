package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1 = context.getBean("s1", Student.class);
		System.out.println(s1);
		s1.study();
		Student s2 = context.getBean("getStudents", Student.class);
		System.out.println(s2);
	}

}
