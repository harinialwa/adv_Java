package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");

//		Student student = container.getBean("st", Student.class);
//		System.out.println(student);
//		
		Employee employee = container.getBean("emp", Employee.class);
		System.out.println(employee);

	}
}
