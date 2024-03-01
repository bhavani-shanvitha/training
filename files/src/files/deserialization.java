package files;

import java.io.*;

public class deserialization {
	public static void main(String[] args) {
		String path="C:\\Users\\U6074793\\eclipse-workspace\\files\\demo123\\object.txt";
		File f=new File(path);
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
		 fis=new FileInputStream(f);
		 ois=new ObjectInputStream(fis);
		 Object o=ois.readObject();//upcasting
		 car c=(car)o;
			System.out.println("brand: "+c.brand);
			System.out.println("color: "+c.color);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}
