package array1;

public class constructor {
	String name;
	double d;
	{
		System.out.println("nst called");
	}
	constructor(){
		System.out.println("cons called");
	}
	public static void main(String[] args) {
		constructor c=new constructor();
		new constructor();
	}
}
