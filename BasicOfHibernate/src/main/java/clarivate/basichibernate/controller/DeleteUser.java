package clarivate.basichibernate.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clarivate.basichibernate.entity.User;

public class DeleteUser {
	public static void main(String[] args) {
		int userId=1001;
		boolean result=deleteById(userId);
		if(result) {
			System.out.println("user with the give id "+userId+" removed");
		 }else {
			 System.out.println("user with the give id "+userId+" not found");
		 }
	}
	public static boolean deleteById(int userId) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("alpha");
		 EntityManager manager=factory.createEntityManager();
		 EntityTransaction Transaction=manager.getTransaction();
		 User user= manager.find(User.class,userId);
		 if(user!=null) {
		 Transaction.begin();
	     manager.remove(user);
	     Transaction.commit();
	     return true;
		 }
		 return false;
	}
}
