package embeddedClass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Country_Captial")
public class WC{

	@Id
	@Column(name="Cid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Cname")
	private String name;
	
	@Column(name="Cpm")
	private String pm;
	
	private Capital cap;

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

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public Capital getCap() {
		return cap;
	}

	public void setCap(Capital cap) {
		this.cap = cap;
	}
		
	
}
