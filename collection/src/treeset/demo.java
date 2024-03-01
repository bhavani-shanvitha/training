package treeset;

import java.util.*;

public class demo {
	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
		hs.add(100);
		hs.add(20);
		hs.add(1);
		hs.add(58);
		hs.add(48);
		hs.add(98);
		//hs.add("shannu");
		//hs.add(null);
		System.out.println(hs);
		TreeSet hs1=new TreeSet(hs);
		System.out.println(hs1);
}
}
