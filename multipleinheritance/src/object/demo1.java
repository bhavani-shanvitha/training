package object;

public class demo1 {
	String name;
	int pages;
	demo1(String name,int pages){
		this.name=name;
		this.pages=pages;
	}
	public boolean equals(Object o) {
		demo1 d=(demo1) o;
		if(this.name==d.name&& this.pages==d.pages) {
		return true;
		}
		return false;
	}
	public static void main(String[] args) {
		demo1 d1=new demo1("java",1000);
		demo1 d2=new demo1("java",1000);
		System.out.println(d1);//internally (d.toString());
		//d1.toString();
		System.out.println(d2);
		//System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}
}
