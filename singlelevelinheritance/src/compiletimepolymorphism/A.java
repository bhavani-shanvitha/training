package compiletimepolymorphism;
//binding is done during compile time
public class A {
	void m1() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
	
	}
}
