package array1;
//
//public class static1 {
//	public static void main(String[] args) {
//		System.out.println();
//	}
//}

public class static1
{
	static int a=23;
	String colour;
	double price;
	String material;
	//double volume;
	
	public void empty() {
		System.out.println("fill the bottle");
	}
	public void full() {
		System.out.println(" no need to fill the bottle");
	}
	public static void main(String[] args) {
		 static1 mybottle=new static1();
		mybottle.empty();
		mybottle.full();
		mybottle.colour="blue";
		mybottle.price=300.0;
		mybottle.material="plastic";
		
		System.out.println(mybottle.colour);
		System.out.println(mybottle.price);
		System.out.println(mybottle.material);
	}
}