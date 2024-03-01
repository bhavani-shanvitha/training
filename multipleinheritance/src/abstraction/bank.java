package abstraction;

public abstract class bank {
	abstract void withdraw();
	abstract void deposit();
	void balance(){
		System.out.println("balance");
	}
}
