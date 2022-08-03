package New;

public class EmpDepts extends Employee {

	private String deptName;


	public EmpDepts(String name, int salary, String deptName) {
		super(name, salary);
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + "연봉 : " + salary + "부서 : " + deptName);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}

}
