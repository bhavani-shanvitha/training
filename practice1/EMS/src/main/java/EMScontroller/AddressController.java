package EMScontroller;

import java.util.Scanner;

import EMSentity.Address;

public class AddressController {
	public Address readAddressInfo(Scanner read) {
		Address address=new Address();
		System.out.println("enter the street line");
		address.setLine(read.next());
		System.out.println("enter the city");
		address.setCity(read.next());
		System.out.println("enter the state");
		address.setState(read.next());
		System.out.println("enter the country");
		address.setCountry(read.next());
		System.out.println("enter the pincode");
		address.setPincode(read.nextInt());
		return address;
	}
}
