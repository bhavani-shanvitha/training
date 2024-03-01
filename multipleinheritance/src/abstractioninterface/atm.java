package abstractioninterface;

public class atm implements bank{
	int balance=1000;
	public void withdraw(int amount) {
		System.out.println("money withdraw");
		balance=balance-amount;
	}
	public void deposit(int amount) {
		System.out.println("money deposit");
		balance=balance+amount;
	}
	public void checkbalance() {
		System.out.println("money present");
		System.out.println("balance: "+balance);
	
	}
}
