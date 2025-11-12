package fr.fms.entities;

public class Brand extends Person {
	private Employer employer;
	
	public Brand(String _name, String _country, int _age, String _adress, City _city, Employer _employer) {
		super(_name, _country, _age, _adress, _city);
		this.employer = _employer;
	}
	
	@Override
	public String toString() {
		return super.getName() + " " + super.getSurname() + ", " + this.employer.getName() + ", % Rate : " + this.employer.getRate();
	}
}
