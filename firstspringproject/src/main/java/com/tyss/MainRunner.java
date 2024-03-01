package com.tyss;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainRunner {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("config.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		System.out.println(factory);//created core container and object
		//to get the bean object
		//User u1=(User)factory.getBean("user");//obj is of user class
//		System.out.println(u1);
//		u1.setId(101);
//		u1.setName("shannu");
//		u1.setEmail("shannu@gmail.com");
//		System.out.println(u1);
//		
//		User u2=(User)factory.getBean("user");
//		System.out.println(u2);//u1 u2 r bean objects
		
		
		//setter injection
		//User u1=(User)factory.getBean("user");
		//System.out.println(u1);//data will set at runtime
		
		User u1=(User)factory.getBean("user");
		u1.code();
	
	}
}
