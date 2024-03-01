package collections;
import java.util.*;
import java.lang.*;
class Teacher{
	String name;
	int empid;
	Teacher(String name,int empid){
		this.name=name;
		this.empid=empid;
		
	}
}

public class student {
	String name="name";
	int id=123;
	student(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	public int hashCode() {
		return name.hashCode()+((Integer)id).hashCode();
		
	}
	public String toString() {
		//return this.id+this.name;
		return "name: "+name+" id: "+id;
		
	}
	public static void main(String[] args) {
		student s=new student("shannu",12);
		System.out.println(s.toString());
		System.out.println(s);
		ArrayList a=new ArrayList();
		//ArrayList<Teacher> a=new ArrayList();
		a.add(new student("shannu",1));
		a.add(new student("harshi",2));
		a.add(new student("shan",3));
		//a.add(new Teacher("ABC",21));
		System.out.println(a);
//		Iterator i=a.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		for(Object o:a) {
			System.out.print(o);
			System.out.println();
		}
	
		//System.out.println(a.toArray());
//		System.out.println(a.get(0).hashCode());
//		System.out.println(a.get(1).hashCode());
//		System.out.println(a.get(2).hashCode());
//		Teacher t=new Teacher("shannu",12);
//		ArrayList<Integer> a1=new ArrayList();
//		a1.add(10);
//		a1.add(20);
//		a1.add(30);
//		System.out.println(t.toString());
//		System.out.println(t);
		
	}
	
}
