package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CountryData")
public class Country {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Cid")
	private int id;
	
	@Column(name="Cname")
	private String name;
	
	@Column(name="Cpm")
	private String pm;
	
	@Column(name="clang")
	private String lang;
	
	

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", pm=" + pm + ", lang=" + lang + "]";
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
