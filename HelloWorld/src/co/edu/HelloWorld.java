package co.edu;

public class HelloWorld {
	public static void main(String[] atgs) {
		// 변수의 종류: int(정수), double(실수), boolean(논리), String(문자열)
		// int(4byte) < double(8byte)
		// 정수: byte(1byte) < short(2byte) < int(4byte) < long(8byte)
		String name = "10";
		 name = "김두영";
		 // my_age
		 int myAge = 20; // 선언하면서 값을 할당 => 초기화.
		 int yourAge; // 선언:초기화(X)
		 yourAge = 22;
		 double height = 162.4;
		 boolean isMarried = true;
		 String myAddress = "대구 수성구";
		 
		 myAge = 30;
		 height = 165.2;
		 
		 int result = myAge + yourAge; // 변수는 사용을 위해서 값이 할당.
		 double result1 = (double) myAge + height;
		 System.out.println(result);
		 
		System.out.println("안녕하세요 " + name + " 입니다.");
	}

}
