package clarivate.basichibernate.controller;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clarivate.basichibernate.entity.User;
public class UpdateUser {
	 public static void main(String[] args) {
		//updating user password
		 int userId=1000;
		 String userPassword="shannu@123";
		 boolean result=updateUser(userId,userPassword);
		 if(result) {
			User user= FindUserById.findUserById(userId);
			System.out.println("updated user info");
			System.out.println(user);
		 }else {
			 System.out.println("user with the give id "+userId+"not found");
		 }
	}
	 public static boolean updateUser(int userId,String userPassword) {
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("alpha");
		 EntityManager manager=factory.createEntityManager();
		 EntityTransaction Transaction=manager.getTransaction();
		 User user= FindUserById.findUserById(userId);
		
		 if(user!=null) {
			 System.out.println("before updating user password");
			 System.out.println(user);
		 user.setUserPassword(userPassword);
		 Transaction.begin();
	      manager.merge(user);
	      Transaction.commit();
	      return true;
		 }
		 return false;
}
}
