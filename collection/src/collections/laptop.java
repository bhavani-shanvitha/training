package collections;

public class laptop {
	String brand;
	int ram;
	int ssd;
	double price;
	laptop(String brand,int ram,int ssd,double price){
		this.brand=brand;
		this.ram=ram;
		this.ssd=ssd;
		this.price=price;
	}
	public String toString() {
		return "brand: "+ brand+" ram :"+ ram+" ssd :"+ ssd+" price: "+ price;
	}
}
