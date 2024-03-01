package files;
import java.io.*;
public class folderdemo {
	public static void main(String[] args) {
		//creating a folder inside the workspace/project
//		File f=new File("demo123");
//		System.out.println(f.mkdir());
		
		//create a folder in a specific drive or position
		String path="C:\\Users\\U6074793\\OneDrive - Clarivate Analytics\\Desktop\\test";
		File f1=new File(path);
		System.out.println(f1.mkdir());
		
		System.out.println("----------------------");
		//exists() method
		System.out.println(f1.exists());
		//delete()
//		System.out.println(f1.delete());
		System.out.println(f1.exists());
	}
}
