package GST.Entity;
import javax.persistence.*;

@Entity
public class Company {
	@Id
	private int companyId;
	@Column(unique=true)
	private String companyName;
	private long PhoneNumber;
	@OneToOne
	private GST gst;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public GST getGst() {
		return gst;
	}
	public void setGst(GST gst) {
		this.gst = gst;
	}
	
}
