package homework;

public class ObesityInfo extends StandardWeightInfo {
//	- StandardWeightInfo 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	double big = 0;

	public ObesityInfo(String name, int height, int weight,double big) {
		super(name, height, weight);
		this.big = big;
	}

	public double getBig() { 
		return big; 
	}

	public double getObesity() {
		return big = ((weight - avg) / avg * 100);
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("이름: " + name + "키: " + height + "몸무계: " + weight + "표준체중: " + avg + "비만도: " + getObesity());
	}

}
