package practice2;
import java.util.*;

//day3 programs

class demoadd {
	
	//without return type without arguments
//	public static void add() {
//		int a=10;
//		int b=20;
//		System.out.println(a+b);
//	}
//	public static void main(String[] args) {
//		System.out.println("prostarts");
//		demoadd.add();
//		System.out.println("proends");
//	}
	
	
//	//without return type with arguments
//	public static void add(int a,int b) {
//		
//		System.out.println(a+b);
//	}
//	public static void main(String[] args) {
//		System.out.println("prostarts");
//		demoadd.add(2,3);
//		System.out.println("proends");
//	}
	
//	//with return type without arguments
//		public static int add() {
//			int a=10;
//			int b=20;
//			return a+b;
//		}
//		public static void main(String[] args) {
//			System.out.println("prostarts");
//			//demoadd.add(); 
//			System.out.println(demoadd.add());
//			System.out.println("proends");
//		}

	
	//with return type with arguments
			public static int add(int a,int b) {
				return a+b;
			}
			public static void main(String[] args) {
				System.out.println("prostarts");
				int c=demoadd.add(1,2);
				System.out.println(c);
				System.out.println(demoadd.add(20,30));
				System.out.println("proends");
			}
}
