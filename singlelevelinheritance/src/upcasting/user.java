package upcasting;
class Ola{
	int baseprice=20;
}
class mini extends Ola{
	int perkm=7;
	void displaybill() {
		System.out.println("total bill for mini"+(baseprice+perkm));
	}
}
class auto extends Ola{
	int perkm=5;
	void displaybill() {
		System.out.println("total bill for auto"+(baseprice+perkm));
	}
}
class suv extends Ola{
	int perkm=9;
	void displaybill() {
		System.out.println("total bill for suv"+(baseprice+perkm));
	}
}
public class user {
	public static void main(String[] args) {
//		//upcasting
//		Ola o=new Ola();
//		o=new auto();
//		//System.out.println(o instanceof auto);
//		if(o instanceof mini)
//		//downcasting
//		{
//		auto a=(auto) o;
//		a.displaybill();
//		}
//		else {
//			System.out.println("not possible");
//		}
//		//mini m=(mini)o;
//		//System.out.println();
		
		Ola o;
		o=new auto();
		if(o instanceof auto) {
			auto a=(auto) o;
			a.displaybill();
			
		}
		else if(o instanceof mini) {
			mini a=(mini)o;
			a.displaybill();
		}
		else if(o instanceof suv) {
			suv a=(suv)o;
			a.displaybill();
		}
		else {
			System.out.println("no ride is present");
		}
	}
}
