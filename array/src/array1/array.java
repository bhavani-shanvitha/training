package array1;

public class array {
	public static void main(String[] args) {
		
	//with new keyword
		//declaration of an array
//		int[] a=new int[4];
//		System.out.println(a);
//		
//		double[] d=new double[30];
//		System.out.println(d.length);
//		
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		 for(int i=0;i<a.length;i++)
//		 {
//			 System.out.println(a[i]);
//		 }
	
		 
		 
	//without new keyword
		  int[] b= {1,2,3,4,5};
		  System.out.println(b.length);
		  for(int i=0;i<b.length;i++)
			 {
				 System.out.println(b[i]);
			 }
	}

}
