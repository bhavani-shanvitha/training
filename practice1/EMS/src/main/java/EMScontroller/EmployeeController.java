package EMScontroller;

import java.util.Scanner;

import EMSentity.Address;
import EMSentity.Employee;

public class EmployeeController {
	public Employee readEmployeeInfo(Scanner read) {
		Employee employee=new Employee();
		System.out.println("enter the name");
		employee.setName(read.next());
		System.out.println("enter the email");
		employee.setEmail(read.next());
		System.out.println("enter the password");
		employee.setPassword(read.next());
		System.out.println("enter the role");
		employee.setRole(read.next());
		AddressController addresscontroller=new AddressController();
		Address address=addresscontroller.readAddressInfo(read);
		return employee;
	}
}
