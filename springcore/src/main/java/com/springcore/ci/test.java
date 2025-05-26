package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ci.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		/*
		 * Person aj = (Person) context.getBean("aj"); System.out.println(aj);
		 */
		Additon add = (Additon) context.getBean("add");
		add.doSum();

	}

}
