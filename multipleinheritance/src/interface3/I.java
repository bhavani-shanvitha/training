package interface3;

import inteface1.wagonr;

public class I extends demo implements i1,i2{
	public void start() {
		System.out.println("started");
	}
	public void stop() {
		System.out.println("stoped");
	}
	public void honk() {
		System.out.println("honked");
	}
	public static void main(String[] args) {
		I i= new I();
		i.start();
		i.stop();
		i.honk();
	}
}
