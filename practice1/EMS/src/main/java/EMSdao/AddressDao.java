package EMSdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import EMSUtill.EMSutill;
import EMSentity.Address;



public class AddressDao {
	public Address saveAddress(Address address) {
		EntityManager manager =EMSutill.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		 transaction.begin();
			manager.persist(address);
			transaction.commit();
			return address;
	}
}
