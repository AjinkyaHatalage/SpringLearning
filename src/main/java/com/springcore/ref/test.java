package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A temp = (A) context.getBean("Aref");
		System.out.println(temp);
		System.out.println("getting b object using a");
		System.out.println(temp.getOb().getY());
	}

}
