package array1;

public class constructorchaining {
	String name;
	int id;
	int marks;
	constructorchaining(String name){
		this.name=name;
	}
	constructorchaining(String name,int id){
		this(name);//this call stmt
		this.id=id;
	}
	constructorchaining(int marks,String name,int id){
		this(name,id);//this call stmt
		this.marks=marks;
	}
	
public static void main(String[] args) {
		
		constructorchaining  pc=new constructorchaining ("shannu");
		System.out.println("name:"+pc.name);
		
		constructorchaining  pc1=new constructorchaining ("shan",1);
		System.out.println("name:"+pc1.name);
		System.out.println("id:"+pc1.id);
		
		constructorchaining  pc2=new constructorchaining (40,"shan",1);
		System.out.println("name:"+pc2.name);
		System.out.println("id:"+pc2.id);
		System.out.println("marks:"+pc2.marks);
		
}
}
