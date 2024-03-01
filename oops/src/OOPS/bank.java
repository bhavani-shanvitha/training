package OOPS;

public class bank {

	private String name="shannu";
	private double balance=20000;
	
	//getter method for name
	public String getName() {
		return name;
	}
	//getter for balance
	public double getBalance() {
		return balance;
	}
	//setter method for name
	public void setName(String name) {
		this.name=name;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void balancecheck(double balance) {
		if(balance>=1000) {
			System.out.println("sufficient balance");
		}
		else {
			System.out.println("less balance");
		
		}
	}
}
