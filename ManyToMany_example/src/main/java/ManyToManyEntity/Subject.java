package ManyToManyEntity;
import java.util.List;
import javax.persistence.*;
@Entity
public class Subject {
	@Id
	private int id;
	private String name;
	private int numberOfclass;
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
	public int getNumberOfclass() {
		return numberOfclass;
	}
	public void setNumberOfclass(int numberOfclass) {
		this.numberOfclass = numberOfclass;
	}
	
}
