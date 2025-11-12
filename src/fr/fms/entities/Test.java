package fr.fms.entities;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		
		Capital paris = new Capital("Paris", "France", "Eiffel Tower");
		System.out.println(paris);
		System.out.println();
		
		persons.add(new Employee("John", "Doe", 30, "Paris", new City("Paris", "France"), "FMS", 1400));
		
		persons.add(new Brand("Jane", "Doe", 30, "Paris", new City("Paris", "France"), new Employer("FMS", 5)));
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
