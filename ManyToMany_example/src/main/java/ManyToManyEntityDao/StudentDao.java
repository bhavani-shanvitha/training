package ManyToManyEntityDao;
import java.util.List;
import javax.persistence.*;

import ManyToManyEntity.Student;

public class StudentDao {
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		 return factory.createEntityManager();
	
	}
	public Student saveStudent(Student student) {
		EntityManager manager =getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
			manager.persist(student);
			transaction.commit();
			return student;
	}
}
