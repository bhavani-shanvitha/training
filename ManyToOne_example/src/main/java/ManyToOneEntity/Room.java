package ManyToOneEntity;
import javax.persistence.*;
import java.util.*;
@Entity
public class Room {
	@Id
	private int id;
	private String name;
	private Double price;
	private int numberofUsers;
	private String type;
	@ManyToOne
	private Hotel hotel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNumberofUsers() {
		return numberofUsers;
	}
	public void setNumberofUsers(int numberofUsers) {
		this.numberofUsers = numberofUsers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
}
