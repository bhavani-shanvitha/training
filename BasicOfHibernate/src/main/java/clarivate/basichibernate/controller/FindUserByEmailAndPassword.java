package clarivate.basichibernate.controller;

import javax.persistence.*;
import java.util.List;

import clarivate.basichibernate.entity.User;

public class FindUserByEmailAndPassword {
	 public static void main(String[] args) {
		String userEmail="geetha@12";
		String userPassword="geetha34";
		User user=findUserByEmailAndPassword(userEmail,userPassword);
		if(user!=null) {
			System.out.println("user found");
			System.out.println(user);
		}else {
			System.out.println("user not found");
		}
	 }
	 public static User findUserByEmailAndPassword(String userEmail, String userPassword) {
		 String jpqlQuery="select a from User a where a.userEmail=?1 and a.userPassword=?2";
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("alpha");
		 EntityManager manager=factory.createEntityManager();
		 
		 Query query=manager.createQuery(jpqlQuery);
		 query.setParameter(1, userEmail);
		 query.setParameter(2, userPassword);
		 
		 List listOfUser=query.getResultList();
		 if(listOfUser!=null && !(listOfUser.isEmpty())) {
			 return (User) listOfUser.get(0);
		 }
		 return null;
	}
}
