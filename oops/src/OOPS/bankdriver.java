package OOPS;

public class bankdriver {
public static void main(String[] args) {
	bank b=new bank();
	System.out.println("original details");
		System.out.println("name:"+b.getName());
		System.out.println("balance:"+b.getBalance());
		
		b.setName("harshi");
		b.setBalance(30000);
		
		System.out.println("fetching the new data");
		System.out.println("name:"+b.getName());
		System.out.println("balance:"+b.getBalance());
		b.balancecheck(2000);
		
	}
}
