package upcasting;
class father{
	int i;
}
class child extends father{
	int j;
}
public class upcasting {
	public static void main(String[] args) {
		child c=new child();
		System.out.println(c.j);
		System.out.println(c.i);
		father f=c;
		System.out.println(f.i);
		//System.out.println(f.j);
	}

}
