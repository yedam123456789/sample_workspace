package homework;

public class EmpDept extends Employee {
	private String department;

	public EmpDept(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf("이름: %s 연봉: %d 부서: %s\n", getName(), getSalary(), department);
	}

	@Override
	public void print() {
		System.out.println("서브클래스");
	}

	public void callSuperThis() {
		super.print();
		this.print();
	}

}
