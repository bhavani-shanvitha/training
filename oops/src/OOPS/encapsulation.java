package OOPS;

public class encapsulation {
	private int pin=123;
	//getter method:fetching the data
	public int getPin() {
		return pin;
	}
	//setter method used to set the data or modify the data
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	public static void main(String[] args) {
		encapsulation e=new encapsulation();
		//System.out.println(e.pin);
		System.out.println(e.getPin());
	}

}
