package array1;

public class staticinitializer {
	static int s=1;
	static {
		System.out.println("hii");
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(s);
	}
	static {
		System.out.println("abc");
	}
}
