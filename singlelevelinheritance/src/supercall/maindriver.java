package supercall;

class parent{
	int i;
	parent(){
		System.out.println("HHH");
	}
	parent(int i){
		this.i=i;
	}
}
class child extends parent{
	
	
//	int j;
//	double p;
//	child(double p){
//		this.p=p;
//	}
	int j;
	child(int i,int j){
	super();
//		//super(i);//call the con of parent class
		this.j=j;
	}
}

public class maindriver {
	public static void main(String[] args) {
		child c=new child(1,2);
		System.out.println(c.i);
		System.out.println(c.j);
	}

}
