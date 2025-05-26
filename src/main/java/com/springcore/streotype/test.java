package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/streotype/streoConfig.xml");
		/*
		 * Student student = context.getBean("student", Student.class);
		 * System.out.println(student);
		 */
		Student student = context.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());

		System.out.println(student.hashCode());

		Student student2 = context.getBean("ob", Student.class);
		System.out.println(student2.hashCode());

	}

}
