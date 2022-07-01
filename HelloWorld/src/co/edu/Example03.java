package co.edu;

public class Example03 {
/*
 * 문자역 타입의 변수 사용.
 * 10+20=>30, "10"+"20"="1020"
 */
	public static void main(String[] args) {
		System.out.println(10+20);
		System.out.println("10"+"20");
		//string 김두영 = "Kim";
		
		// 내 이름은 ㅇㅇㅇ 입니다.
		System.out.println("내 이름은 \"김두영\" 입니다.");
		//"{\"name\":\"김두영\". \"age\": 26} " json데이터타입.
		System.out.println("{\"name\":\"김두영\". \"age\": 26} ");
		
		// 문자열 ->정수, 실수.
		int num1 = Integer.parseInt("100"); // "100" -> 100
		double num2 = Double.parseDouble("127.99");
		double num3 = Double.parseDouble("122.01");
		
		double result = sum(num1, num2);
		result = minus(num2, num3);
		System.out.println("합결과:" + result);
		System.out.printf("차이는 %.2f 입니다.",result);
		
		System.out.printf("저의 이름은  %s이고 나이는 %d 입니다.", "김두영",26);
		
		// 이름,나이, 몸무게 = 3개변수 선언.
		
	}
	
	// 2개의 숫자를 합한 결과를 반환. method.
	public static int sum(int num1, int num2) {
	int sum = num1 + num2;
	  return sum;
	}
	
	public static double sum(int n1, double n2) {
	   double sum = n1 + n2 ;
	   return sum;
	}
	public static double minus(double n1, double n2) {
		   double sum = n1 - n2 ;
		   return sum;
		}

}
