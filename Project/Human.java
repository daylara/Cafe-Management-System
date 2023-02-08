import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Human {
	private String Name;
	private String Surname;
	private int Age;
	private Boolean Sex;
	private String Phone_number;
	static ArrayList<String[]> Employees = new ArrayList<String[]>();

	public Human(String name, String surname, int age, Boolean sex, String phone_number) {
		super();
		Name = name;
		Surname = surname;
		Age = age;
		Sex = sex;
		Phone_number = phone_number;
	}

	public Human() {
		super();
	}

	public static ArrayList<String[]> read_csv() {

		// ArrayList<String[]> Employees = new ArrayList<String[]>();
		int count = 0;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:/Users/dilar/Downloads/Employee.csv/"));
			String line = reader.readLine();
			while (line != null) {
				if (count != 0) {
					String[] employee = line.split(";"); // use comma as separator
					Employees.add(employee);
				}
				count++;
				line = reader.readLine();
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return Employees;

	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Boolean getSex() {
		return Sex;
	}

	public void setSex(Boolean sex) {
		Sex = sex;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

}
