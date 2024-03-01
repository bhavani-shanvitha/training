package array1;
import java.util.Scanner;
public class array1 {
	//store values in array using loop
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size");
		n=sc.nextInt();
		
		int[] a=new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array elements");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+ " ");
		 }
	}

}
