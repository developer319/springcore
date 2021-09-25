package com.springcore.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Properties/config.xml");
		
		SpringProperties spr=(SpringProperties) context.getBean("props");
		System.out.println(spr);

		SpringProperties spr1=(SpringProperties) context.getBean("prop1");
		System.out.println(spr1);



	}

}
