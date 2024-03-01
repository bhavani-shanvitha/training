package multithreading;

public class sleep1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
