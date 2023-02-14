package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Country {


	@Id
	@Column(name="Cid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Cname")
	private String name;
	
	@Column(name="Cpm")
	private String pm;
	
	@OneToOne(fetch= FetchType.EAGER )//Lazy will not map other table unless required
	private Capital cap;
	

	public Capital getCap() {
		return cap;
	}

	public void setCap(Capital cap) {
		this.cap = cap;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", pm=" + pm + ", cap=" + cap + "]";
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
