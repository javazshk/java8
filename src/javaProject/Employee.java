package javaProject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Employee {

	String firstName;
	String lastName;
	double salary;
	String department;
	long id;

	public Employee() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Employee(String firstName, String lastName, double salary, String department, long id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", department="
				+ department + ", id=" + id + "]";
	}

	public static void main(String[] args) {

		Employee[] employees = { new Employee("zabi", "khan", 5000, "ib", 10),
				new Employee("leeny", "Khan", 4000, "wm", 2),
				new Employee("ravi", "teja", 6000, "rm", 4),
				new Employee("sam", "gamgee", 5000, "ub", 7), 
				new Employee("henry", "caval", 5000, "LA", 3),
				new Employee("christian", "bale", 8000, "bur", 1) };

		List<Employee> listofEmployees = Arrays.asList(employees);
		System.out.println("Print out all employees ..");
		listofEmployees.stream().forEach(System.out::println);

		System.out.println("sorting employees based on their id.. ");
		listofEmployees.stream()
		.sorted(Comparator.comparingLong(Employee::getId))
		.forEach(System.out::println);

		Predicate<Employee> fourtwosixthousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

		// Printing a list of employees whose salary lies in
		// 4k and 6k in ascending order
		System.out.println("list of employees whose salary lies in " + "4k and 6k in ascending order..");
		listofEmployees.stream()
		.filter(fourtwosixthousand)
		.sorted(Comparator.comparing(Employee::getSalary))
		.forEach(System.out::println);

	}
}