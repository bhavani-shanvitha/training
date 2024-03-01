package abstraction;

abstract class demo {
	abstract void m1();
	abstract void m2();
	void m3() {
		System.out.println("bye");
	}
}
	abstract class child extends demo
	{
		void m1() {
			System.out.println("hi");
		}
	}
class grandchild extends child{
	void m2() {
		System.out.println("fron gc");
	}
}
