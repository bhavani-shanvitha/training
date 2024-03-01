package clarivate.basichibernate.controller;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.*;

import clarivate.basichibernate.entity.User;
public class FindAllUser {
	public static void main(String[] args) {
		List<User> listOfUser=findAllUser();
		for(User user:listOfUser) {
			System.out.println(user);
		}
	}
	
	public static List<User>findAllUser(){//jpql query(alias)
		//in sql we use * like that but here we use variables
		//we use here table name as entity class name
		
		String sqlQuery="select u from User u";
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("alpha");
		 EntityManager manager=factory.createEntityManager();
		 
		 Query query=manager.createQuery(sqlQuery);
		 return query.getResultList();
		
		}
	}
