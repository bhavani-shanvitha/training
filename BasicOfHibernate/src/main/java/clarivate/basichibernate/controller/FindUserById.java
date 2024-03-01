package clarivate.basichibernate.controller;
import javax.persistence.*;

import clarivate.basichibernate.entity.User;

public class FindUserById {
	 
	public static void main(String[] args) {
		int userId=1000;
		User user=findUserById(userId);
		if(user!=null) {
			System.out.println(user);
		}else {
			System.out.println("user with the given user "+userId+" not found");
		}
	}
	public static User findUserById(int userId) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("alpha");
		 EntityManager manager=factory.createEntityManager();
		 return manager.find(User.class,userId);
		 
		 //find will take only primarykey value only
		 
	}
}
