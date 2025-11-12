package fr.fms.entities;

public class Capital extends City{
	private String monument;
	
	public Capital(String _name, String _country, String _monument) {
		super(_name, _country);
		setMonument(_monument);
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String _name) {
		this.monument = _name;
	}
	
	@Override
	public String toString() {
		return "[City : " + this.getName() + ", " + this.getCountry() + ", monument : " + this.getMonument() + "]";
	}
}
