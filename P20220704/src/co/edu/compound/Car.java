package co.edu.compound;
/*
 *  자동차(Object) ->class
 */
public class Car { // 설계도
	// 속성: 필드
	String model;
	int price;
	int maxSpeed;
	int speed;
	double weight;
	double weigth;
	
//	생성자  필드의 초기값을 지정.
	public Car() {
		System.out.println("생성자 호출.");
		maxSpeed = 400;
	}
	public Car(String model , int maxspeed) {
		this.model = model;
		this.maxSpeed = maxspeed;
	}
//	동작: 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	public void showSpeed(){
		System.out.println("현재 속도는 "+speed +"KM/h 입니다.");
		
	}
	public void run() {
		System.out.println(model + " 가달림.");
	}
	public void start() {
		System.out.println(model+" 자동차가 출발");
	}
	public void stop() {
		System.out.println(model+" 자동차가 멈춤.");
	}
}
