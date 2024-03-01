package collections;
import java.util.Comparator;
public class ssd  implements Comparator{
	public int compare(Object o1,Object o2) {
		laptop temp1=(laptop)o1;
		laptop temp2=(laptop)o2;
		if(temp1.ssd>temp2.ssd) {
			return 1;
		}
		if(temp1.ssd<temp2.ssd) {
			return -1;
		}
		return 0;
	}
}
