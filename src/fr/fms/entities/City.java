package fr.fms.entities;

import java.util.ArrayList;

public class City {
	public static ArrayList<City> cities = new ArrayList<City>();
	
	private String name;
	private String country;
	private int population;
	
	public City(String _name, String _country, int _population) {
		setName(_name);
		setCountry(_country);
		setPopulation(_population);
		
		cities.add(this);
	}
	
	public City(String _name, int _population) {
		setName(_name);
		setCountry("Unknown");
		setPopulation(_population);
		
		cities.add(this);
	}
	
	public City(String _name, String _country) {
		setName(_name);
		setCountry(_country);
		setPopulation(0);
		
		cities.add(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String _country) {
		this.country = _country;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public void setPopulation(int _population) {
		if (_population >= 0)
			this.population = _population;
		else
			this.population = 0;
	}
	
	public boolean FilterCity(String _city) {
		return this.name.equals(_city);
	}
	
	public boolean FilterCountry(String _country) {
		return this.country.equals(_country);
	}
	
	public void Display() {
		System.out.println("City : " + this.name + ", " + this.country + ", population of : " + this.population + ".");
	}
	
	@Override
	public String toString() {
		String pop = (this.population > 0) ? ", population of : " + this.population : "";
		return "[City : " + this.name + ", " + this.country + pop + "]";
	}
}
