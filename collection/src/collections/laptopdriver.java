package collections;
import java.util.*;
public class laptopdriver {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(new laptop("hcl",8,992,500000));
		a1.add(new laptop("dell",4,712,20000));
		a1.add(new laptop("lenovo",12,512,60000));
		a1.add(new laptop("asus",2,322,50000));
		System.out.println(a1);
		Collections.sort(a1,new ram());
		System.out.println(a1);
		
		Collections.sort(a1,new price());
		System.out.println(a1);
		
		Collections.sort(a1,new ssd());
		System.out.println(a1);
		
	}
}
