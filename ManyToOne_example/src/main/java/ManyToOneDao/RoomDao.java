package ManyToOneDao;

import java.util.List;
import javax.persistence.*;

import ManyToOneEntity.Room;
public class RoomDao {

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		 return factory.createEntityManager();
	
	}
	public Room saveRoom(Room room) {
		EntityManager manager =getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
			manager.persist(room);
			transaction.commit();
			return room;
	}
}
