package EMScontroller;

import java.util.List;
import java.util.Scanner;

import EMSdao.EmployeeDao;
import EMSentity.Employee;

public class ManagerController {
	public void operation(Scanner read) {
		while(true) {
			System.out.println("select choice:-\n1.create task\n2.display all employee\n3.exit");
			int choice=read.nextInt();
			switch(choice) {
			case 1:// Create Task and Assign to Employee
				break;
			case 2:
				displayEmployee();
				break;
			case 3:

				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}

	private void displayEmployee() {
		
		EmployeeDao employeeDao=new EmployeeDao();
		List<Employee> employees=employeeDao.findAllEmployeeAsSoftwareEng();
		System.out.println("employee info");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
