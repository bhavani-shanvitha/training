package onetomany_example;
import javax.persistence.*;

import onetomany_example.dao.MobileDao;

import java.util.*;
public class MobileController {
	public static void main(String[] args) {
		Mobile mobile=readMobileInfo();
		MobileDao dao=new MobileDao();
		mobile=dao.saveMobile(mobile);
		System.out.println("mobile saved...");
	}

	private static Mobile readMobileInfo() {
		Mobile mobile=new Mobile();
		mobile.setId(1002);
		mobile.setName("G43");
		mobile.setBrand("Nokia");
		List<Sim> sims=readSimInfo();
		mobile.setSims(sims);
		return mobile;
	}

	private static List<Sim> readSimInfo() {
		Sim sim1=new Sim();
		sim1.setId(103);
		sim1.setImrc("93826756");
		sim1.setProvider("bsnl");
		
		Sim sim2=new Sim();
		sim2.setId(104);
		sim2.setImrc("3814552");
		sim2.setProvider("jio");

		List<Sim> sims=new ArrayList<>();
		sims.add(sim1);
		sims.add(sim2);
		return sims;
	}
}
