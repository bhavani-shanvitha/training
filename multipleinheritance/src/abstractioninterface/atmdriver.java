package abstractioninterface;

public class atmdriver {
 public static void main(String[] args) {
	 bank b=new atm();
	 //b.withdraw();
	 //b.deposit();
	 b.checkbalance();
	 b.deposit(500);
	 b.checkbalance();
	 b.withdraw(1000);
	 b.checkbalance();
 }
}
