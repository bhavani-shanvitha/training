package hashmap;
import java.util.*;


public class book{
	String name;
	int pages;
	book(String name,int pages){
		this.name=name;
		this.pages=pages;
		
	}
	public String toString() {
		return this.name;
		
	}
	
	public static void main(String[] args) {
		//book b= new book("shannu",1);
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		
		ArrayList ls=new ArrayList();
		
		switch(n) {
		case 1:
			System.out.println("add book name and pages");
			ls.add(new book("c++",1000));
			ls.add(new book("java",500));
			ls.add(new book("python",3000));
			ls.add(new book("c",400));
			ls.add(new book("dev",8000));
			System.out.println(ls);
			//break;
		case 2:
			System.out.println("deleting");
			Scanner s1=new Scanner(System.in);
			
			System.out.println("enter a name");
			String name=s1.nextLine();
			ls.remove(name);
			System.out.println(ls);
			break;
		case 3:
			System.out.println("updating");
			
			//break;
		
		default:
			System.out.println("pls enter 1 to 3");
		}
		
		}
}



