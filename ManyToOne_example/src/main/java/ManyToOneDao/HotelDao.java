package ManyToOneDao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.*;

import ManyToOneEntity.Hotel;


public class HotelDao {
	public Hotel saveHotel(Hotel hotel) {
		EntityManager manager = RoomDao.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
		 
			manager.persist(hotel);
			transaction.commit();
			return hotel;
	}
}
