package collections;

import java.util.ArrayList;
import java.util.Collections;

public class demo2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(90);
	a1.add(30);
	a1.add(50);
	a1.add(20);
	a1.add(60);
	//System.out.println(a1);
	//sort
	Collections.sort(a1);
	//reverse
	Collections.reverse(a1);
	System.out.println(a1);
	
}
}
