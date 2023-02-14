package embeddedClass;

import jakarta.persistence.Embeddable;

@Embeddable
public class Orage {
private int oid;
	
	private int oprice;
	
	private String ovariety;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getOprice() {
		return oprice;
	}

	public void setOprice(int oprice) {
		this.oprice = oprice;
	}

	public String getOvariety() {
		return ovariety;
	}

	public void setOvariety(String ovariety) {
		this.ovariety = ovariety;
	}
}
