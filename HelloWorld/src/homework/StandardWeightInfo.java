package homework;

public class StandardWeightInfo extends Human {
//	- Human 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )

	double avg = 0;

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	public double getAvg() { 
		return avg;
	}

	public double getStandardWeight() {
		return avg = ((height - 100) * 0.9);
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("이름: " + name + "키: " + height + "몸무계: " + weight + "표준체중: " + getStandardWeight());
	}


}
