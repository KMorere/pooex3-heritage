package fr.fms.entities;

public class Capital extends City{
	private String monument;
	
	public Capital(String _name, String _country, String _monument) {
		super(_name, _country);
		setName(_monument);
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String name) {
		this.monument = name;
	}
	
	@Override
	public String toString() {
		return "[City : " + this.getName() + ", " + this.getCountry() + ", " + this.getMonument() + "]";
	}
}
