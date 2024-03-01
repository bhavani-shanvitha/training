package multithreading;

public class mythread extends Thread {
//	public void start() {
//		System.out.println("start");
//	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}

}
