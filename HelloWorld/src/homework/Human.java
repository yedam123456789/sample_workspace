package homework;

public class Human {
//	- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
	String name;
	int height = 0;
	int weight = 0;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	} 

	public String getName() {
		return name;
	}

	public int getHight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void getInformation() {
		System.out.println("이름: " + name + "키: " + height + "몸무계: " + weight);
	}

}
