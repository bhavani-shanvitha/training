package EMSdao;
import java.util.List;
import javax.persistence.*;

import EMSUtill.EMSutill;
import EMSentity.Address;
import EMSentity.Employee;

public class EmployeeDao {
	public Employee saveEmployee(Employee employee) {
		EntityManager manager =EMSutill.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		// Checking address Object is present
		if(employee.getAddress()!=null) {
			// get the Address Object
			Address address=employee.getAddress();
			AddressDao addressDao=new AddressDao();
			// Save Address
			address=addressDao.saveAddress(address);
			// Update employee Object with saved address object
			employee.setAddress(address);
		}
		 transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return employee;
	}

	public Employee findEmployeeByEmailandPassword(String email,String password) {
		String jpqlQuery="select e from Employee e where e.email=?1 and e.password=?2";
		EntityManager manager=EMSutill.getEntityManager();
		Query query=manager.createQuery(jpqlQuery);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List listOfuser=query.getResultList();
		if(listOfuser!=null && !(listOfuser.isEmpty())) {
			return (Employee)listOfuser.get(0);
		}
		return null;
		
		
	}
	// Find All Employee has Role SE
	public List<Employee> findAllEmployeeAsSoftwareEng() {
		String jpqlQuery="select e from Employee e where e.role=?1";
		EntityManager manager=EMSutill.getEntityManager();
		Query query=manager.createQuery(jpqlQuery);
		query.setParameter(1, "SE");
		return query.getResultList();
	}
}
