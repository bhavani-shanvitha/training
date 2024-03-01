package multithreading;

public class threaddemo2 {
	public static void main(String[] args) {
		myrunnable r=new myrunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
