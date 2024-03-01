package files;
import java.io.*;
public class writedata {
	public static void main(String[] args) {
		String path="C:\\Users\\U6074793\\eclipse-workspace\\files\\demo123\\writedata123.txt";
		File f=new File(path);
		FileWriter fw=null;
		try {
			System.out.println(f.createNewFile());
		    fw=new FileWriter(f);
			fw.write("Hiiii Shannuu");
			fw.flush();
			System.out.println("data written sucessfully");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		finally {
			try {
			fw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("-------------------read data______________");
	}
}
