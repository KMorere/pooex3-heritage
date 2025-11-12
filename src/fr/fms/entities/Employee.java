package fr.fms.entities;

public class Employee extends Person {
	private String employer;
	private int salary;
	private int charges;
	
	public Employee(String _name, String _surname, int _age, String _adress, City _pob, String _employer, int _salary) {
		super(_name, _surname, _age, _adress, _pob);
		setEmployer(_employer);
		setSalary(_salary);
	}
	
	//region get and set.
	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 0)
			this.salary = salary;
		else {
			System.out.println("Salary must be above 0.");
		}
	}
	//endregion
	
	/**
	 * Override of the Remunerate method to get the salary of an Employee.
	 */
	@Override
	public String Remunerate() {
		this.setSalary(salary - this.charges);
		return "Average salary of " + this.getName() + " " + this.getSurname() + 
				" : " + this.getSalary();
	}

	/**
	 * Override of the toString method to display the Class correctly.
	 */
	@Override
	public String toString() {
		return "[Employee : " + this.getName() + " " + this.getSurname() +
				", " + this.getAge() + ", " + this.getAdress() + ", " +
				this.getPob() + ", employed by " +
				this.getEmployer() + ", salary of " + this.getSalary() + "]";
	}
}
