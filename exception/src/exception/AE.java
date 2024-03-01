package exception;

public class AE {
	public static void m1() throws ArithmeticException{
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		System.out.println("starts");
		try {
		m1();
		}
		catch(ArithmeticException e) {
			System.out.println("tq");
		}
		System.out.println("stops");
	}
}
