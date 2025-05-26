package com.springcore.sandalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/sandalone/collections/AloneConfig.xml");

		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("-------------------------------");
		System.out.println(person1.getFeestructure());
		System.out.println(person1);
	}

}
