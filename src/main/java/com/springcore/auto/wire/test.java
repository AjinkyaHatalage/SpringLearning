package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoConfig.xml");
		Emp emp1 = context.getBean("emp1", Emp.class);
		System.out.println(emp1);
		Emp emp2 = context.getBean("emp2", Emp.class);
		System.out.println(emp2);
		Emp emp3 = context.getBean("emp3", Emp.class);
		System.out.println(emp3);
	}

}
