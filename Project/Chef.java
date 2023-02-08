
public class Chef extends Human {
	
	private int Salary;

	public Chef(String name, String surname, int age, Boolean sex, String phone_number, int salary) {
		super(name, surname, age, sex, phone_number);
		Salary = salary;

	}
	
	
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int salary) {
		Salary = salary;
	}
	
}
