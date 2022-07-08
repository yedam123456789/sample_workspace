package co.edu.compound;

/*
 * 이름 연락처 email 생일 키 몸무게:
 */
public class Friend {

	// 필드.명명규칙(소문자,소문자뒤에 대문자= camelCase, 선 영문, )
	String name;
	double height;
	double weight;
	String email;
	int birthday;
	int tell;
	int age;

	// 생성자 기본생성자를 입력
	public Friend() {
		age = 20;
	}

	// 이름 연락처
	public void showInfo(String name, int age) {
		System.out.println("이름은 "+name +"나이는 "+age);

	} // set메소드

	public void Tell(int tell) {
		this.tell = tell;
	}

	public void Email(String email) {
		System.out.println("친구의 이메일"+email+"입니다");
		this.email = email;

	}

	public void Birthday(int birthday) {

	}

	public void Age(int age) {

	}

	public void Weight(double weight) {

	}

	public void setHeight(double height) {
		if (height > 0) {
			System.out.println("잘못된값이 입력됨");
			this.height = 165.0;
		} else {
			this.height = height;
		}

	}

}
