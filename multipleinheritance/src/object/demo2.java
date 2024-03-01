package object;

public class demo2 {
	String name;
	int pages;
	demo2(String name,int pages){
		this.name=name;
		this.pages=pages;
	}
	public boolean equals(Object o) {
		demo2 d=(demo2) o;
		if(this.name==d.name&& this.pages==d.pages) {
		return true;
		}
		return false;
	}
	public int hashcode() {
		return name.hashCode()+((Integer)pages).hashCode();
	}
	public static void main(String[] args) {
		demo2 d1=new demo2("java",1000);
		demo2 d2=new demo2("java",1000);
		System.out.println(d1);//internally (d.toString());
		//d1.toString();
		System.out.println(d2);
		//System.out.println(d1==d2);
		//System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}
