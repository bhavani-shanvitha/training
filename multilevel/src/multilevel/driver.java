package multilevel;

public class driver {

	public static void main(String[] args) {
		child c=new child();
		System.out.println(c.BMW);
		System.out.println(c.nano);
		System.out.println(c.cycle);
		
		father f=new father();
		System.out.println(f.cycle);
		System.out.println(f.nano);
		
		grandfather f1=new grandfather();
		System.out.println(f1.cycle);
	}
}
