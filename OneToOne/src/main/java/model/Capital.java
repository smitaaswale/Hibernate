package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Capital {
	
	@Id
	@Column(name="Cap_id")
	private int cid;
	
	@Column(name="Cap_name")
	private String cname;
	
	@OneToOne(mappedBy = "cap")
	private Country co;

	@Override
	public String toString() {
		return "Capital [cid=" + cid + ", cname=" + cname + ", co=" + co + "]";
	}

	public Country getCo() {
		return co;
	}

	public void setCo(Country co) {
		this.co = co;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
