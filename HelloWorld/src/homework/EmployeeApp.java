package homework;

public class EmployeeApp {
	public static void main(String[] args) {

		EmpDept edp = new EmpDept("이지나", 3000, "교육부");
		edp.callSuperThis();
		edp.getInformation();

	}
}
