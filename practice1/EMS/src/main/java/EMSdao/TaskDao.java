package EMSdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import EMSUtill.EMSutill;
import EMSentity.Address;
import EMSentity.Task;

public class TaskDao {
	public Task saveTask(Task task) {
		EntityManager manager =EMSutill.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
			manager.persist(task);
			transaction.commit();
			return task;
	}
}
