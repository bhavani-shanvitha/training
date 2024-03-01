package files;
import java.io.*;
public class car implements Serializable{
	String brand;
	String color;
	car(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
}
