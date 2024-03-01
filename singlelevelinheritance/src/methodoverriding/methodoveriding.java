package methodoverriding;



//class father{
//	public void bike() {
//		System.out.println("this is honda bike");
//	}
//}
//class shan extends father{
//	public void bike() {
//		System.out.println("this is bullet bike");
//	}
//}
//class shan1 extends shan{
//	
//}
//public class methodoveriding {
//public static void main(String[] args) {
//	shan s=new shan();
//	s.bike();
//	shan1 s1=new shan1();
//	s1.bike();
//	father f=new father();
//	f.bike();
//}
//}
class vehicle{
	public void start() {
		System.out.println("vehicle is started");
	}
	public void stop() {
		System.out.println("vehicle is stoped");
	}
}
class bike extends vehicle{
	public void start() {
		System.out.println("bike has started");
	}
	public void stop() {
		System.out.println("bike has stoped");
	}
	 public void shiftgears(){
		System.out.println("change the gears");
	}

}

public class methodoveriding{
public static void main(String[] args) {
	bike b=new bike();
	b.start();
	b.stop();
	b.shiftgears();
	
	vehicle v=new vehicle();
	v.start();
	v.stop();
}
}