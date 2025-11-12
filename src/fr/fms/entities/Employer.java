package fr.fms.entities;

public class Employer {
	private String name;
	private int earning;
	
	public Employer(String _name, int _earning) {
		setName(_name);
		setEarning(_earning);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public int getEarning() {
		return this.earning;
	}
	
	public void setEarning(int _earning) {
		this.earning = _earning;
	}
}
