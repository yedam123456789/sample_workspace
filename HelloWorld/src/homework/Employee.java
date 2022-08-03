package homework;

public class Employee {
	private String name;
	private int salary;

	public Employee() {
	}

	public Employee(String name, int salary) {
		this.name = name; 
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		System.out.println(" 이름:" + name + " 연봉:" + salary);
	}

	public void print() {
		System.out.println("수퍼클래스");
	}
}
