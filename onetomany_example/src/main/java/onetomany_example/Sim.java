package onetomany_example;
import javax.persistence.*;
@Entity
public class Sim {
	@Id
	private int id;
	private String imrc;
	private String provider;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImrc() {
		return imrc;
	}
	public void setImrc(String imrc) {
		this.imrc = imrc;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
}
