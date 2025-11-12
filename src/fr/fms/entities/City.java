package fr.fms.entities;

public class City {
	private String name;
	private String country;
	
	public City(String _name, String _country) {
		setName(_name);
		setCountry(_country);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
