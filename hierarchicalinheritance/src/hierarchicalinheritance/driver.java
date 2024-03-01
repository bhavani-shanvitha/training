package hierarchicalinheritance;

public class driver {
	public static void main(String[] args) {
		C c1=new C();
		c1.aclass();
		c1.cclass();
		
		B b1=new B();
		b1.aclass();
		b1.bclass();
		
		A a1=new A();
		a1.aclass();
	}
}
