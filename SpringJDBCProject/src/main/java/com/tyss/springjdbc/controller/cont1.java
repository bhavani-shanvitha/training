package com.tyss.springjdbc.controller;
//user input
	 
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	 
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.jdbc.core.JdbcTemplate;

	import com.tyss.springjdbc.Config.SpringjdbcConfig;
	import com.tyss.springjdbc.dao.UserDao;
	import com.tyss.springjdbc.entity.User;
	public class cont1{
		static ApplicationContext context = new AnnotationConfigApplicationContext(SpringjdbcConfig.class);
		static User u1=context.getBean(User.class);
		static UserDao dao=context.getBean(UserDao.class);
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			while(true)
			{
				System.out.println("Choose option");
				System.out.println(" Enter 1 for Enter details");
				System.out.println("enter 2 to update details");
				System.out.println("Enter 3 for deleting");
				System.out.println("Enter 4 for fetching all the details");
				System.out.println("enter 5 for viewing a particular data");
				
				switch(sc.nextInt())
				{
				case 1:
					insert();
					break;
				case 2:
					update();
					break;
				case 3:
					delete();
					break;
				case 4:
					displayall();
					break;
				case 5:
					fetch();
					break;
				default:
					System.out.println("Enter correct option");
					break;
					
				}
			}
			
		}
		public static void insert()
		{
			
			System.out.println("Enter details name,id mail");
			String name=sc.next();
			int id=sc.nextInt();
			String mail=sc.next();
			u1.setId(id);
			u1.setName(name);
			u1.setEmail(mail);
			System.out.println(dao.saveUser(u1));
		}
		public static void displayall()
		{
			List<Map<String,Object>> users=dao.fetchAllUsers();
			for(Map<String,Object> user:users) {
				System.out.println(user.get("id"));
				System.out.println(user.get("name"));
				System.out.println(user.get("email"));
				System.out.println("***********************");
			}
		}
		public static void update()
		{
			System.out.println("Enter id u want to update");
			int id=sc.nextInt();
			System.out.println("Enter name u want o change");
			String name=sc.next();
			System.out.println(dao.updateUser(id, name));
			
		}
		public static void delete()
		{
			System.out.println("Enter the id u waznt to delete");
			int id=sc.nextInt();
			System.out.println(dao.deleteUserById(id));
		}
		public static void fetch()
		{
			System.out.println("Enter the id which u want to see");
			int id=sc.nextInt();
			System.out.println(dao.fetchUserById(id));
			
		}
		
	 
	}
	
	
 
 
 
