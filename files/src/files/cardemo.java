package files;
import java.io.*;
public class cardemo {
	public static void main(String[] args) {
		String path="C:\\Users\\U6074793\\eclipse-workspace\\files\\demo123\\object.txt";
		File f=new File(path);
		FileOutputStream y=null;
		ObjectOutputStream z=null;
		
		try {
			System.out.println(f.createNewFile());
			 y=new FileOutputStream(f);
			z=new ObjectOutputStream(y);
			car c=new car("honda","black");
			z.writeObject(c);
			z.flush();
			System.out.println("object has been passed");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				y.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				z.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
