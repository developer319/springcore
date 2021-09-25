package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        ApplicationContext context=
//         new ClassPathXmlApplicationContext("config.xml");
//        Student student1=(Student) context.getBean("student1");
//        System.out.println(student1);
        
        //Calling constructor injection
        ApplicationContext context=
         new ClassPathXmlApplicationContext("config1.xml");
        Student student1=(Student) context.getBean("student1");
        System.out.println(student1);
        Student student2=(Student) context.getBean("student2");
        System.out.println(student2);
        
    	//using p schema
    	
    	ApplicationContext context1 = new ClassPathXmlApplicationContext("pschemaconfig.xml");
    	        Student student3=(Student) context1.getBean("student3");
    	        System.out.println(student3);
    	        Student student4=(Student) context1.getBean("student4");
    	        System.out.println(student4);
        
    }
}
