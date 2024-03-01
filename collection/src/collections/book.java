package collections;

import java.util.Collections;
import java.util.LinkedList;

public class book implements Comparable{
	String name;
	int pages;
	book(String name,int pages){
		this.name=name;
		this.pages=pages;
		
	}
	public String toString() {
		//return this.id+this.name;
		return "name: "+name+" pages: "+pages;
	}
	public boolean equals(Object o) {//downcasting
		book b=(book)o;
		if(this.name==b.name&& this.pages==b.pages) {
			return true;
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode()+((Integer)pages).hashCode();
		
	}
	public int compareTo(Object o) {//upcasting
		book temp=(book)o;
		if(this.pages>temp.pages) {
			return 1;
		}
		if(this.pages<temp.pages) {
		    return -1;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		book b= new book("shannu",1);
		System.out.println(b.toString());
		System.out.println(b);
		LinkedList ls=new LinkedList();
		ls.add(new book("c++",1000));
		ls.add(new book("java",500));
		ls.add(new book("python",3000));
		ls.add(new book("c",400));
		ls.add(new book("dev",8000));
		System.out.println(ls);
		

		//System.out.println(ls.get(1));
		Collections.sort(ls);
		System.out.println(ls);
		//reverse
		Collections.reverse(ls);
		System.out.println(ls);
}
}

