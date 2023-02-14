package model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Sport {
	
	@Id
	private int sid;
	
	private String sname;
	
	@ManyToMany(mappedBy = "sp")
	private List<Player> pl;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Player> getPl() {
		return pl;
	}

	public void setPl(List<Player> pl) {
		this.pl = pl;
	}

	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", sname=" + sname + ", pl=" + pl + "]";
	}
	
	

}
