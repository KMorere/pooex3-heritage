package fr.fms.entities;

public class Employer {
	private String name;
	private float rate;
	
	public Employer(String _name, float _rate) {
		setName(_name);
		this.rate = _rate;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public float getRate() {
		return this.rate;
	}
}
