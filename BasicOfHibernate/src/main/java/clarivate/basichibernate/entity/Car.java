package clarivate.basichibernate.entity;
import javax.persistence.*;
@Entity 
public class Car {
	@Id
	private int carId;
	@Column(unique=true)
	private String carName;
	//@Column(unique=true)
	private double carPrice;
	private String carBrand;
	private String carType;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + ", carBrand=" + carBrand
				+ ", carType=" + carType + "]";
	}
	
}
