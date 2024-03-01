package files;
import java.io.*;
public class demo {
	public static void main(String[] args) {
		String path="C:\\Users\\U6074793\\eclipse-workspace\\files\\demo123\\demo111.txt";
		String path1="C:\\Users\\U6074793\\eclipse-workspace\\files\\demo123\\demo11.mp4";
		File f=new File(path);
		File f1=new File(path1);
		try {
		//System.out.println(f.createNewFile());
		System.out.println(f1.createNewFile());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
