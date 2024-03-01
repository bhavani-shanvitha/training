package vector;

import java.util.Vector;
public class demo {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add("shannu");
		v.add(40);
		System.out.println(v);
		v.add(2,200);
		System.out.println(v);
		
	}
}
