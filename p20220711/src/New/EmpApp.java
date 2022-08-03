package New;

public class EmpApp {
	public static void main(String[] args) {
		
		Employee emp = new EmpDepts("이지나", 3000, "교육부");
		emp.getInformation();
		emp.print();
	}
}
