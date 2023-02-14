package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Country {


	@Id
	@Column(name="Cid")
	private int id;
	
	@Column(name="Cname")
	private String name;
	
	@Column(name="Cpm")
	private String pm;
	
	@OneToMany(mappedBy = "co")
	private List<City> ct;
	

	public List<City> getCt() {
		return ct;
	}

	public void setCt(List<City> ct) {
		this.ct = ct;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", pm=" + pm + ", ct=" + ct + "]";
	}

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

	

}
