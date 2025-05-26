package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp);
		/*
		 * Emp [nameString=radhe, phones=[1234, 1234, 1234, 1234, 1234, null],
		 * addressEStrings=[1234], courses={java=2month, python=1month},
		 * propsprProperties={Gender=Male, age=24}]
		 * 
		 */
	}

}
