package practice2;

import java.util.Scanner;

public class methodoverloadingscanner {
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plese enter a value");
		int a=sc.nextInt();
		System.out.println("plese enter b value");
		int b=sc.nextInt();
		System.out.println("plese enter b value");
		int c=sc.nextInt();
		add(a,b);
		add(a,b,c);
	}
}
