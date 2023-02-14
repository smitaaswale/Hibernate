package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Player {
	
	@Id
	private int pid;
	
	private String pname;
	
	private int gersey;
	
	public Player(int pid, String pname, int gersey, List<Sport> sp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.gersey = gersey;
		this.sp = sp;
	}


	@OneToMany(cascade = CascadeType.ALL)
	private List<Sport> sp;


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getGersey() {
		return gersey;
	}

	public void setGersey(int gersey) {
		this.gersey = gersey;
	}

	public List<Sport> getSp() {
		return sp;
	}

	public void setSp(List<Sport> sp) {
		this.sp = sp;
	}


	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", gersey=" + gersey + ", sp=" + sp + "]";
	}
}
