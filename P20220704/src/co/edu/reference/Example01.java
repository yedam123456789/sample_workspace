package co.edu.reference;

public class Example01 {
	public static void main(String[] args) {
		// 1~100 수를 출력
		//짝수만 출력
		//sum누적
		int result = 0;
		int sum = 0;
		for (int i =1; i<=100; i++ ) {
			if(i % 2 == 0) {
				sum = sum +i;
				System.out.println("i의 값: "+ i + "sum의 값: " + sum );
			}
			
			System.out.println("결과값: "+ sum);
		}
		
	}

}
