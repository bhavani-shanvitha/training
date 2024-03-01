package hashmap;
import java.util.*;
public class demo {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
		//to add the ele in hapmap put() is used
		hm.put(1, "shannu");
		hm.put(2, "harshi");
		hm.put(3.7,"abc");
		hm.put("shan",23.8);
		System.out.println(hm);
		
		//get() used to get the value based on key
		System.out.println(hm.get(1));
		System.out.println(hm.get(4.6));//null key is not present
		
		//containsKey()->used to tell whether key is present or not
		System.out.println(hm.containsKey("shan"));//true
		System.out.println(hm.containsKey("sha"));//false
		
		//containsValue()->used to tell that particular value present or not
		System.out.println(hm.containsValue("shannu"));//true
		System.out.println(hm.containsValue("sha"));//false
		
		//remove->used to remove a key and value pair based on key specified
		hm.remove(2);
		System.out.println(hm);
		
		//isEmpty()-> tells map is empty or not
		System.out.println(hm.isEmpty());
		
		//clear()->clears the map/remove all objects
//		hm.clear();
//		System.out.println(hm);
//		System.out.println(hm.isEmpty());
	     for(Object o:hm.keySet()) {
	    	 if(hm.get(o)=="shannu")
	    		 System.out.println(o);
	    		 
	     }
		}
		}

