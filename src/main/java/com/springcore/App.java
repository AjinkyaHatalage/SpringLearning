package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Dependency Injection
		System.out.println("Hello World!");
		// fetching values from config.xml bean
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		Student student = (Student) context.getBean("student1");
		// uses to_string method which wrote code otherwise we get hashcode.
		// (com.springcore.Student@65466a6a)
		System.out.println(student); // op: Student [studentId=31, studentName=Ajinkya hatalage, studentAddress=Ich]

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
		/*
		 * output: Hello World! Student [studentId=31, studentName=Ajinkya hatalage,
		 * studentAddress=Ich] Student [studentId=32, studentName=Abhi hatalage,
		 * studentAddress=sangli] Student [studentId=32, studentName=AJ Hatalage,
		 * studentAddress=Delhi]
		 */

	}
}
