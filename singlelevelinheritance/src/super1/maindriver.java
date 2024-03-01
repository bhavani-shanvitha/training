package super1;

class grandfather{
	int i=70;
}
class parent extends grandfather {
	int i=10;
	void m1() {
		System.out.println("hii");
		System.out.println(super.i);
	}
}
class child extends parent {
	int i=9;
	void m1() {
		System.out.println(i);
		System.out.println(super.i);
		super.m1();
	}
}
public class maindriver {
 public static void main(String[] args) {
	child c=new child();
	//System.out.println(c.i);
	c.m1();
 }
}
