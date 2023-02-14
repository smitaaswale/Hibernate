package com.smita.hbr.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="CountryData")//to change the database table name not same as class 
public class Country {

	@Column(name="C_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement concept
	private int id;
	
	@Column(name="C_Name")
	private String name;
	
	@Column(name="Nation_Lang")
	private String lang;
	
	@Column(name="Prime_Minister")
	private String pm;
	
	@Transient  // field need in java but not in database table
	private int stCount;
	
//	@Lob
//	private byte[] image;
//
//	public byte[] getImage() {
//		return image;
//	}
//
//	public void setImage(byte[] image) {
//		this.image = image;
//	}

	public int getStCount() {
		return stCount;
	}

	public void setStCount(int stCount) {
		this.stCount = stCount;
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

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", lang=" + lang + ", pm=" + pm + "]";
	}
	
	
}
