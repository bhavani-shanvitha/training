package ManyToManyEntityDao;
import java.util.List;
import javax.persistence.*;

import ManyToManyEntity.Subject;


public class SubjectDao {
	public Subject saveSubject(Subject subject) {
		EntityManager manager =StudentDao.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
			manager.persist(subject);
			transaction.commit();
			return subject;
	}
}
