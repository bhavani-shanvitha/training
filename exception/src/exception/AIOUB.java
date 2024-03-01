package exception;

public class AIOUB {
	public static void main(String[] args) {
		System.out.println("starts");
		int[] a= {1,2,3,4,5};
		//System.out.println(a[10]);
		try {
		//System.out.println(a[10]);
			a[19]=19;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handles");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("from exception");
		}
		finally {
			System.out.println("tq");
		}
		System.out.println("stops");
	}
}
