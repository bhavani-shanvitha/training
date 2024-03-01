package sim;

public class sim {
private String serviceprovider;
private long number;
private int balance;
String colour="red";

public String getserviceprovider() {
	return serviceprovider;
}
public long getnumber() {
	return number;
}
public int getbalance() {
	return balance;
}
public void setnumber(int number) {
	this.number=number;
}

	public static void main(String[] args) {
		sim s=new sim();
		s.setnumber(11);
		System.out.println(s.getnumber());
		System.out.println(s.getbalance());
		System.out.println(s.getserviceprovider());
	}
}
