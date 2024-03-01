package collections;

import java.util.Comparator;

public class price implements Comparator{
	public int compare(Object o1,Object o2) {
		laptop temp1=(laptop)o1;
		laptop temp2=(laptop)o2;
		if(temp1.price>temp2.price) {
			return 1;
		}
		if(temp1.price<temp2.price) {
			return -1;
		}
		return 0;
	}
}
