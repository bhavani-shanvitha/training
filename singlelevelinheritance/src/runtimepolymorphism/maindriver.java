package runtimepolymorphism;



class A {
	public void m1() {
		System.out.println("hi");
	}
}
	class B extends A{
		public void m1() {
			System.out.println("bye");
		}
	}
public class maindriver {

	public static void main(String[] args) {
		A a=new B();
		a.m1();
	
	}
}

