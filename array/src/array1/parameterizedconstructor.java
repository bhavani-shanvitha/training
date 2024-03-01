package array1;

public class parameterizedconstructor {

	String name;
	int id;
	int marks;
	parameterizedconstructor(String s,int b,int c){
//		System.out.println(s);
//		System.out.println(b);
//		System.out.println(c);
		name=s;
		id=b;
		marks=c;
	}
	public static void main(String[] args) {
		
		parameterizedconstructor pc=new parameterizedconstructor("shannu",16,40);
//		pc.name="shannu";
//		pc.id=16;
//		pc.marks=40;
		System.out.println(pc.name);
		System.out.println(pc.id);
		System.out.println(pc.marks);
		
		
	}
}
