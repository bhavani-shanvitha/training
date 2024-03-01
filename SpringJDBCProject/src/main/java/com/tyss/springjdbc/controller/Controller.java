package com.tyss.springjdbc.controller;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tyss.springjdbc.Config.SpringjdbcConfig;
import com.tyss.springjdbc.dao.UserDao;
import com.tyss.springjdbc.entity.User;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringjdbcConfig.class);
		//JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
		//System.out.println(context);
		UserDao dao=context.getBean(UserDao.class);
		Scanner sc=new Scanner(System.in);
		
		//Insert
//		User u1=context.getBean(User.class);
//		u1.setId(3);
//		u1.setName("shan");
//		u1.setEmail("shan@abc.com");
//		System.out.println(dao.saveUser(u1)+":row affected..");
		
	
		//update
//		int id=2;
//		String name="shanvitha";
//		dao.updateUser(id, name);
		//or
		//System.out.println(dao.updateUser(2, "shanvitha")+": row affected..");
		
		//delete
		//System.out.println(dao.deleteUserById(3)+": row affected..");
		
		
		
		//fetching
//		List<Map<String, Object>> users = dao.fetchAllUsers();
//		for(Map<String,Object> user:users) {
//			System.out.println(user.get("id"));
//			System.out.println(user.get("name"));
//			System.out.println(user.get("email"));
//			System.out.println("...........");
//		}
		
		//fetch user by id
		
		//System.out.println(dao.fetchUserById(2));
		
		
		}
	}

