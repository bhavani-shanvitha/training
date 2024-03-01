package onetomany_example.dao;
import javax.persistence.*;

import onetomany_example.Mobile;
import onetomany_example.Sim;

import java.util.*;
public class MobileDao {
	//implementation to interact with rdms application
	 public EntityManager getEntityManager() {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		 return factory.createEntityManager();
	 }
	 public Mobile saveMobile(Mobile mobile) {
		 EntityManager manager =getEntityManager();//helper methods
		 EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
		 //write implementation to save mobile entity
			List<Sim> listOfSims=mobile.getSims();
			for(Sim sim:listOfSims) {
				manager.persist(sim);
			}
			manager.persist(mobile);
			transaction.commit();
			return mobile;

	 }
	 public Mobile findById(int id) {
		 EntityManager manager =getEntityManager();
		 return manager.find(Mobile.class,id);
	 }
			
	 }

