package GST.Entity;
import javax.persistence.*;


public class Controller {
	public static void main(String[] args) {
		Company company =new Company();
		company.setCompanyId(1112);
		company.setCompanyName("clarivate Analytics");
		company.setPhoneNumber(8920367l);

		GST gst = new GST();
		gst.setGstId(1001);
		gst.setGstNumber("BTSU23K1");
		gst.setStatus("yes");

		company.setGst(gst);
		
		company = saveDetails(company);
		System.out.println("User With Pan Info Saved!!");
	}

	public static Company saveDetails(Company company) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(company.getGst());
		manager.persist(company);
		transaction.commit();

		return company;
	}

}
