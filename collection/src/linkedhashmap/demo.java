package linkedhashmap;

import java.util.*;

public class demo {
	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		
		//to add the ele in hapmap put() is used
		hm.put(1, "shannu");
		hm.put(2, "harshi");
		hm.put(3.7,"abc");
		hm.put("shan",23.8);
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		for(Object key:s) {
			System.out.println(key+"-"+hm.get(key));
		}
	}

}
