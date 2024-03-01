package collections;


import java.util.*;
import java.lang.*;
public class arraylist1 {
	public static void main(String[] args) {
		
//	ArrayList a1=new ArrayList();
//	a1.add(10);
//	a1.add(20.9);
//	a1.add("shannu");
//	a1.add('S');
//	System.out.println("ele in a1"+a1);
//	
//	ArrayList a2=new ArrayList();
//	a2.addAll(a1);
//	System.out.println("ele in a2"+a2);
//	
//	ArrayList a3=new ArrayList();
//	a3.add(30);
//	a3.add(11);
//	a3.addAll(a1);
//	System.out.println("ele in a3"+a3);
//	
//	//add(int index,object)
//	a3.add(2,77);
//	System.out.println(a3);
//	//add(index,coll);
//	a3.addAll(1,a1);
//	System.out.println(a3);
//	
//	//removing the element
//	System.out.println("-----------------------");
//	System.out.println(a3);
//	a3.remove(10);
//	System.out.println(a3);
//	a3.removeAll(a1);
//	System.out.println(a3);
//	a3.remove(((Integer)77));
//	System.out.println(a3);
//	
//	//a3.clear();
//	System.out.println(a3);
////	a3.retainAll(a2);
////	System.out.println(a3);
//	
//	System.out.println(a3.size());
//	System.out.println(a3.isEmpty());
//	
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(10.9);
		a.add("shan");
		a.add(1);
		System.out.println(a.contains(1));
		//System.out.println(a.containsAll(a1));
		System.out.println(a.indexOf(1));
		System.out.println(a.indexOf(100));
		System.out.println(a.indexOf(1));
		System.out.println(a.lastIndexOf(1));
		
		System.out.println(a);
		System.out.println(a.get(1));
		for(Object o:a) {
			System.out.println(o+" ");
		}
		System.out.println("============");
		//iterator
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
