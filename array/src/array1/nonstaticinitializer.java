package array1;

public class nonstaticinitializer {
	static int a=100;
	String name;
	int id;
	static{
		System.out.println(a);
		System.out.println("hii");
		
	}
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		nonstaticinitializer s=new nonstaticinitializer();
		System.out.println(s.name);
		System.out.println(s.id);
		nonstaticinitializer s1=new nonstaticinitializer();
		System.out.println(s1.name);
		System.out.println(s1.id);	
		
	}
	{
		System.out.println(a);
		System.out.println("b");
	
	}
}
