package EMSentity;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.*;
@Entity
public class Task {
	@Id
	//over an int id type which is an primary key of an entity
	//it will create id automatically
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String descs;
	private String status;
	@CreationTimestamp
	private LocalDateTime CreatedDateTime;
	@UpdateTimestamp
	private LocalDateTime EndedDateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescs() {
		return descs;
	}
	public void setDescs(String desc) {
		this.descs = descs;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreatedDateTime() {
		return CreatedDateTime;
	}
	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		CreatedDateTime = createdDateTime;
	}
	public LocalDateTime getEndedDateTime() {
		return EndedDateTime;
	}
	public void setEndedDateTime(LocalDateTime endedDateTime) {
		EndedDateTime = endedDateTime;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", descs=" + descs + ", status=" + status + ", CreatedDateTime=" + CreatedDateTime
				+ ", EndedDateTime=" + EndedDateTime + "]";
	}
	
}
