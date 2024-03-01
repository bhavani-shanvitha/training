package com.tyss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		//create object of an application context
//		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//		User u1=(User) context.getBean();
//		u1.code();
//		System.out.println(u1);
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		User u1=(User)context.getBean("user");
		u1.code();
		System.out.println(u1);
	}
}
