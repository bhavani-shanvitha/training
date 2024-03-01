package object;

public class demo {
	String name;
	int pages;
	demo(String name,int pages){
		this.name=name;
		this.pages=pages;
	}
	public String toString() {
		return "name: "+name+" pages: "+pages;
	}
	public static void main(String[] args) {
		demo d=new demo("java",100);
		demo d1=new demo("java",100);
		System.out.println(d);//internally (d.toString());
		//d1.toString();
		System.out.println(d1);
	}
}
