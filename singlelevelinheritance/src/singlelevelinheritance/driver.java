package singlelevelinheritance;

public class driver {
public static void main(String[] args) {
	child c=new child();
	System.out.println(c.cycle);
	System.out.println(c.nano);
	
	father f=new father();
	System.out.println(f.nano);
}
}
