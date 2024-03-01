package exception;

public class checkedexception {
	public static void main(String[] args) {
		System.out.println("starts");
		int a=10;
		int b=0;
		//int c=0;
		try {
			System.out.println(a/b);//AE e=new AE; throw e;
		
		}
		catch(ArithmeticException e) {
		System.out.println("exception handled successfully");
		}
		System.out.println("ends");
	}
}
