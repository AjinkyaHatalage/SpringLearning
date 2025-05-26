package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Started program...........");
		// spring jdbc -> JdbcTemplate
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
		/*
		 * JdbcTemplate template = context.getBean("jdbctemplate", JdbcTemplate.class);
		 * System.out.println(template);
		 */
		// insert Query
		/* String query = "insert into student(id,name,city) values(?,?,?)"; */

		// fire the query
		/*
		 * int result = template.update(query, 2, "Anjali Hatalage", "Sangli");
		 * System.out.println("number of record inserted" + result);
		 */

		StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);
		Student student = new Student();
		student.setId(6);
		student.setName("Aj Jackson");
		student.setCity("MH09");
		// int result = studentDao.insert(student);
		// System.out.println("Student Added : " + result);

		Student student2 = new Student();
		student2.setCity("Pune");
		student2.setName("Ajay Devgan");
		student2.setId(3);
		int result1 = studentDao.change(student2);
		System.out.println("Data changed: " + result1);

		// Delete query

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter Id which to be delete: "); int id = sc.nextInt();
		 * int result2 = studentDao.delete(id); System.out.println("Data Removed: " +
		 * result2);
		 */
		// selecting single data
		Student s = studentDao.getStudent(11);
		System.out.println("Selcting Single Object: " + s);

		List<Student> students = studentDao.getAllStudents();
		for (Student sa : students) {
			System.out.println(sa);
		}
	}
}
