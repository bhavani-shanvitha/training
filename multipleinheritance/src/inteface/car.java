package inteface;

	public class car implements vehicle{
		public void start() {
			System.out.println("car has been started");
		}
		public void stop() {
			System.out.println("car has stoped");
		}
		public static void main(String[] args) {
			car c= new car();
			c.start();
			c.stop();
		}
	}

