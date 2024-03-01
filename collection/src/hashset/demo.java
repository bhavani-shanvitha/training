package hashset;
import java.util.*;
public class demo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(20);
		hs.add(1);
		hs.add(58);
		hs.add(48);
		hs.add(98);
		hs.add("shannu");
		hs.add(null);
		System.out.println(hs);
		
		HashSet hs1=new HashSet(hs);
		System.out.println(hs1);
	
		
	}
}
