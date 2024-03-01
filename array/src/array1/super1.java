package array1;

public class super1 {
	String name;
	int id;
	int marks;
	super1(String name){
		this.name=name;
	}
	super1(String name,int id){
		this(name);//this call stmt
		this.id=id;
	}
	super1(int marks,String name,int id){
		this(name,id);//this call stmt
		this.marks=marks;
	}
	
public static void main(String[] args) {
		
		super1 pc=new super1("shannu");
		System.out.println("name:"+pc.name);
		
		super1  pc1=new super1 ("shan",1);
		System.out.println("name:"+pc1.name);
		System.out.println("id:"+pc1.id);
		
		super1  pc2=new super1 (40,"shan",1);
		System.out.println("name:"+pc2.name);
		System.out.println("id:"+pc2.id);
		System.out.println("marks:"+pc2.marks);
		
}
}
