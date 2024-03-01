package com.tyss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		User u1=context.getBean(User.class);
		//System.out.println(u1);
		u1.code();
		System.out.println(u1);
		
	}
}
