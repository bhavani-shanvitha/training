package files;
import java.io.*;
public class readdata {
	public static void main(String[] args) {
		String path="C:\\Users\\U6074793\\eclipse-workspace\\files\\demo123\\writedata123.txt";
		File f=new File(path);
		FileReader fr=null;
	
		try {
			fr=new FileReader(f);
			int ch=fr.read();
			while(ch!=-1) {
				System.out.print((char)ch);//downcast
				ch=fr.read();
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
