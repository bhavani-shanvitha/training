package array1;

public class constructoroverloading {
	String name;
	int id;
	int marks;
	constructoroverloading (String name,int id,int marks){

		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	constructoroverloading (int id,String name){

		this.name=name;
		this.id=id;
	
	}
	constructoroverloading (String name,int marks){

		this.name=name;
		this.marks=marks;
	}
	
	
	public static void main(String[] args) {
		
		constructoroverloading  pc=new constructoroverloading ("shannu",16,40);
		System.out.println("name:"+pc.name);
		System.out.println("id:"+pc.id);
		System.out.println("marks:"+pc.marks);
		
		constructoroverloading pc1=new constructoroverloading(16,"shan");
		System.out.println("name:"+pc1.name);
		System.out.println("id:"+pc1.id);
		
		constructoroverloading  pc2=new constructoroverloading ("shanvitha",40);
		System.out.println("name:"+pc2.name);
		System.out.println("id:"+pc2.marks);
		
		
	}
}
