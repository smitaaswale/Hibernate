package model;


public class Country {


	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", lang=" + lang + ", pm=" + pm + "]";
	}

	private int id;
	
	private String name;
	
	private String lang;
	
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	private String pm;
	

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
