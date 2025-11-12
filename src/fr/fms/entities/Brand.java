package fr.fms.entities;

public class Brand extends Person {
	private Employer employer;
	private float rate;
	
	public Brand(String _name, String _country, int _age, String _adress, City _city, Employer _employer, float _rate) {
		super(_name, _country, _age, _adress, _city);
		this.employer = _employer;
		this.rate = _rate;
	}
	
	@Override
	public String Remunerate() {
		return "Average salary of " + this.getName() + " " + this.getSurname() + 
				" : " + (this.employer.getEarning() * this.rate / 100);
	}
	
	@Override
	public String toString() {
		return super.getName() + " " + super.getSurname() + ", " + 
				this.employer.getName() + ", % Rate : " + this.rate;
	}
}
