package fr.fms.entities;

import java.util.ArrayList;

public class Person {
	public static ArrayList<Person> persons = new ArrayList<Person>();
	
	private String name;
	private String surname;
	private int age;
	private String adress;
	private City pob;
	
	public Person(String _name, String _surname, int _age, String _adress, City _pob) {
		setName(_name);
		setSurname(_surname);
		setAge(_age);
		setAdress(_adress);
		setPob(_pob);
		
		persons.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else {
			this.age = 0;
			System.out.println("Can't have a negative number.");
		}
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public City getPob() {
		return pob;
	}

	public void setPob(City pob) {
		this.pob = pob;
	}
	
	@Override
	public String toString() {
		return "Person : " + this.name + " " + 
				this.surname + ", " + 
				this.age + ", adress : " + 
				this.adress + ", place of birth : " +
				this.pob + ".";
	}
}
