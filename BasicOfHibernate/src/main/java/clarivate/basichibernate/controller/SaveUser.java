package clarivate.basichibernate.controller;
import java.util.*;
import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
//saving user info inside rdbms application using hibernate
import clarivate.basichibernate.entity.User;
public class SaveUser {
	 public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		User user=readUserInfo(read);
		saveUser(user);
	}
	 public static void saveUser(User user) {//trying to save theuser info
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("alpha");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 
		 
		 entityTransaction.begin();
	      entityManager.persist(user);//save user->helper method persist(Entity Object);
	      //this persistmethod is present in an interface called entitymanager.it is non static method
	      
	      
	   // Save User->helper method persist(Entity Object);
	   // persist(Entity Object);-> is present in an Interface EntityManager
	   // To create Object if EntityManager helper method createEntityManager();
	   // createEntityManager() -> is present in the EntityManagerFactory Interface
	   // To create EntityManagerFactory Object createEntityManagerFactory("Persistence
	   // unit name")
	   //createEntityManagerFactory("Persistence unit name")-> is Present in a class Persistence
	      
	      entityTransaction.commit();//for saving permenantly
		 
	 }
	 private static User readUserInfo(Scanner read) {
		 System.out.println("enter the user id=");
		 int userId=read.nextInt();
		 
		 System.out.println("enter the user name=");
		 String userName=read.next();

		 System.out.println("enter the user email=");
		 String userEmail=read.next();

		 System.out.println("enter the user password=");
		 String userPassword=read.next();
		 
		 System.out.println("enter the user Age=");
		 int userAge=read.nextInt();

		 User user=new User();
		 user.setUserId(userId);
		 user.setUsername(userName);
		 user.setUserEmail(userEmail);
		 user.setUserPassword(userPassword);
		 user.setAge(userAge);
		 return user;
		 
	 }
}
