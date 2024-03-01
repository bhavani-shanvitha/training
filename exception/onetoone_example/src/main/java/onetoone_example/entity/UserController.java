package onetoone_example.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.*;

public class UserController {
	public static void main(String[] args) {
		User user=new User();
		user.setUserId(1002);
		user.setUserName("harshi");
		user.setUserEmail("harshi@abc");
		user.setUserPassword("harshi@134");
		user.setUserPhoneNumber(3456743322l);

		Pan pan = new Pan();
		pan.setPanId(102);
		pan.setPanNumber("ACHTU6GF");
		pan.setPanName("Harshitha");
		pan.setFatherName("madhukar");

		user.setPan(pan);
		
		user = saveUser(user);
		System.out.println("User With Pan Info Saved!!");
	}

	public static User saveUser(User user) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(user.getPan());
		manager.persist(user);
		transaction.commit();

		return user;
	}

}
		
		
		
