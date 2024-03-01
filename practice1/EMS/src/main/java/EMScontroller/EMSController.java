package EMScontroller;
import java.util.Scanner;

import javax.persistence.*;

import EMSdao.EmployeeDao;
import EMSentity.Employee;
public class EMSController {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		EmployeeController empcontroller=new EmployeeController();
		EmployeeDao employeeDao=new EmployeeDao();
		while(true) {
			System.out.println("select the choice:-\n1.Login\n2.Register\n3.Exist");
			int choice=read.nextInt();
			switch(choice) {
			case 1://login operation
				login(empcontroller,employeeDao,read);
				break;
			case 2:
				Employee employee=empcontroller.readEmployeeInfo(read);
				employee=employeeDao.saveEmployee(employee);
				System.out.println("employee saved"+employee);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

	private static void login(EmployeeController empcontroller, EmployeeDao employeeDao, Scanner read) {
		System.out.println("enter the employee email:");
		String email=read.next();
		System.out.println("enter the employee password:");
		String password=read.next();
		Employee employee=employeeDao.findEmployeeByEmailandPassword(email,password);
		if(employee!=null) {
			System.out.println("hi welcome to ems");
			if(employee.getRole().equalsIgnoreCase("manager")){
				//if employee is manager
				ManagerController managercontroller=new ManagerController();
				managercontroller.operation(read);
			}
		}else {
			System.out.println("employee with the given details not found");
		}
	}

	}
