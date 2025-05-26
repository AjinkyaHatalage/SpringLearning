package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		Demo d1 = context.getBean("aj", Demo.class);

		System.out.println(d1);

		SpelExpressionParser temp = new SpelExpressionParser();
		org.springframework.expression.Expression expression = temp.parseExpression("201+201");

		System.out.println(expression.getValue());
	}

}
