package co.edu.api;

class Member {
	String id;
	int age;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			boolean b1 = this.id.equals(((Member) obj).id);
			boolean b2 = this.age == ((Member) obj).age;
			return b1 && b2;
		}
		return false;
	}
	@Override
	public String toString() {
		return "아이디:"+ id + ", 나이: "+  age;
	}
}

public class ObjectEx {
	public static void main(String[] args) {

		Object obj1 = new Object(); // instance => 주소값
		Object obj2 = new Object(); // instance => 주소값

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.toString());

		String name1 = new String("홍길동");
		String name2 = new String("민길동");

		System.out.println(name1.equals(name2));
		System.out.println(name1.toString()); //Sting.toString

		Member member1 = new Member();
		member1.id = "user1";
		member1.age = 10;

		Member member2 = new Member();
		member2.age = 10;
		member2.id = "user1";

		System.out.println(member1.equals(member2)); // 물리적 다른 개체. 논리적 동일안 개체
		System.out.println(member1.toString());
	}

}
