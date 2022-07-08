package co.edu.compound;

public class ClassExam {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;

		String[] names = { "홍길동", "박민수", "김익수" };
		int[] scores = { 80, 85, 79 };
		int[] ages = { 19, 20, 19 };

		Student s1 = new Student(); // 중요!!!!!!!!!!!! / (new)초기화.
		s1.name = "홍길동";
		s1.age = 19;
		s1.score = 80;
		s1.hegiht = 180.3;

		Student s2 = new Student();
		s2.name = "박민수";
		s2.age = 20;
		s2.score = 85;
		s2.hegiht = 179.4;

		Student s3 = new Student();

		s3.name = "김익수";
		s3.age = 19;
		s3.score = 79;
		s3.hegiht = 185.7;

		Student[] students = { s1, s2, s3 };

		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals("김익수")) {
//				System.out.println("나이 "+ students[i].age);
			}
		}
		//
		Car c1 = new Car("투산", 400); // 힙메모리에 인스턴스 생성
		c1.model = "투산";
		c1.price = 7000;
		c1.speed = 120;
		System.out.println("최고속도 "+ c1.maxSpeed);
		c1.setSpeed(80);
		c1.start();
		c1.run();
		c1.showSpeed();
		c1.stop();

//		Car c2 = new Car(); // 힙메모리에 인스턴스 생성
//		c2.model = "스포티지";
//		c2.price = 7500;
//		c2.speed = 110;
//		System.out.println("최고속도 "+ c2.maxSpeed);
//		c2.setSpeed(90);
//		c2.start();
//		c2.run();
//		c2.showSpeed();
//		c2.stop();
//		System.out.println(c1);
	}
}
