package GST.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class GST {
	@Id
	private int gstId;
	@Column(unique=true)
	private String gstNumber;
	private String status;
	public int getGstId() {
		return gstId;
	}
	public void setGstId(int gstId) {
		this.gstId = gstId;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
