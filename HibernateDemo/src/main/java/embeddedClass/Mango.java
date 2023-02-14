package embeddedClass;

import jakarta.persistence.Embeddable;

@Embeddable
public class Mango {
	
	private int mid;
	
	private int price;
	
	private String variety;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	@Override
	public String toString() {
		return "Mango [mid=" + mid + ", price=" + price + ", variety=" + variety + "]";
	}

}
