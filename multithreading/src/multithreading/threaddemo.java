package multithreading;

public class threaddemo {
	public static void main(String[] args) {
		mythread th=new mythread();
		th.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	
	}
}
