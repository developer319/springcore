package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee emp1=(Employee) context.getBean("emp1");
		System.out.println(emp1);
		Employee emp2=(Employee)context.getBean("emp2");
		System.out.println(emp2);

	}

}
