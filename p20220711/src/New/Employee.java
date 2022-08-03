package New;

public class Employee {
	protected String name;
	protected int salary;


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
		System.out.println("이름 : " + name + "연봉 : " + salary);

	}

	public void print() {
		System.err.println("슈퍼클래스");
	}
}
