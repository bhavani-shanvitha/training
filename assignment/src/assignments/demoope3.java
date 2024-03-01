package assignments;
import java.util.Scanner;
public class demoope3 {
	
	//without return type without arguments
		public static void add() {
			Scanner sc=new Scanner(System.in);
			System.out.println("plese enter a value");
			int a=sc.nextInt();
			System.out.println("plese enter b value");
			int b=sc.nextInt();
			System.out.println(a+b);
		}
		public static void subtract() {
			Scanner sc=new Scanner(System.in);
			System.out.println("plese enter a value");
			int a=sc.nextInt();
			System.out.println("plese enter b value");
			int b=sc.nextInt();
			System.out.println(a-b);
		}
		public static void multiply() {
			Scanner sc=new Scanner(System.in);
			System.out.println("plese enter a value");
			int a=sc.nextInt();
			System.out.println("plese enter b value");
			int b=sc.nextInt();
			System.out.println(a*b);
		}
		public static void modulo() {
			Scanner sc=new Scanner(System.in);
			System.out.println("plese enter a value");
			int a=sc.nextInt();
			System.out.println("plese enter b value");
			int b=sc.nextInt();
			System.out.println(a%b);
		}
		public static void division() {
			Scanner sc=new Scanner(System.in);
			System.out.println("plese enter a value");
			int a=sc.nextInt();
			System.out.println("plese enter b value");
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		public static void main(String[] args) {
			System.out.println("prostarts");
			
			demoope.add();
			demoope.subtract();
			demoope.multiply();
			demoope.modulo();
			demoope.division();
			System.out.println("proends");
		}

}
