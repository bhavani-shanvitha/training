package linkedlist;
import java.util.*;
public class demo {
	String name;
	int id;
	demo(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	public String toString() {
		//return this.id+this.name;
		return "name: "+name+" id: "+id;
	}
	public boolean equals(Object o) {
		demo d=(demo)o;
		if(this.name==d.name&& this.id==d.id) {
			return true;
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode()+((Integer)id).hashCode();
		
	}
	public static void main(String[] args) {
		demo d= new demo("shannu",1);
		System.out.println(d.toString());
		System.out.println(d);
		LinkedList ls=new LinkedList();
		ls.add(new demo("shan",1));
		ls.add(new demo("shan1",2));
		ls.add(new demo("shan2",3));
		ls.add(new demo("shan3",4));
		System.out.println(d);
//		ls.add(1);
//		ls.add(2);
//		ls.add(3);
//		ls.add(4);
//		ls.add("shannu");
//		ls.add("harshi");
//		ls.add("mad");
//		ls.add("ammu");
//		//ls.add("shannu");
//		ls.add("Siri");
		//ls.add(6);
//		System.out.println(ls);
//		ls.add(1,20);
		System.out.println(ls);
		System.out.println(ls.get(1));
		Collections.sort(ls);
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println(ls);
	}
}
