package array1;
//this keyword
public class paramecon {
	String name;
	int id;
	int marks;
	paramecon(String name,int id,int marks){

		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public static void main(String[] args) {
		
		paramecon pc=new paramecon("shannu",16,40);

		System.out.println(pc.name);
		System.out.println(pc.id);
		System.out.println(pc.marks);
		
		paramecon pc1=new paramecon("shan",6,40);

		System.out.println(pc1.name);
		System.out.println(pc1.id);
		System.out.println(pc1.marks);
	}

}
