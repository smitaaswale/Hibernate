package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
	
	@Id
	private int id;
	
	private String name;
	
	@ManyToOne
	private Country co;

	public Country getCo() {
		return co;
	}

	public void setCo(Country co) {
		this.co = co;
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

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", co=" + co + "]";
	}

}
