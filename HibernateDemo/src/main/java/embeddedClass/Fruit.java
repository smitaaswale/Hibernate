package embeddedClass;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Fruits")
public class Fruit {

	@Id
	private int id;
	
	private String name;
	
	private String color;
	
	private int rate;
	
	public Orage getOr() {
		return or;
	}

	public void setOr(Orage or) {
		this.or = or;
	}

	private Mango mango;
	
	private Orage or;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", color=" + color + ", rate=" + rate + ", mango=" + mango
				+ ", or=" + or + "]";
	}

	public Mango getMango() {
		return mango;
	}

	public void setMango(Mango mango) {
		this.mango = mango;
	}
}
