package abstract1;

abstract class mobile {
	abstract void call();
	abstract void sms();
	abstract void games();
}
abstract class samsung extends mobile
{

	abstract void os();
}
abstract class apple extends mobile{
	
	abstract void os();
}
class s31 extends samsung{
	void call() {
		System.out.println("calling");
	}
	void sms() {
		System.out.println("messaging");
	}
	void games() {
		System.out.println("games");
	}
	void os() {
			System.out.println("s31");
	}

}
class iphone extends apple{
	void call() {
		System.out.println("calling");
	}
	void sms() {
		System.out.println("messaging");
	}
	void games() {
		System.out.println("games");
	}
	void os() {
		System.out.println("iphone");
	}
}
