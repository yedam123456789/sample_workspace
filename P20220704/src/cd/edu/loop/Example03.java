package cd.edu.loop;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean isTrue = true;
		int sum = 0;
		// sum의 누적값이 100을 초과할 때 반복문 종료.
		do {
			System.out.println("입력하세요: ");
			int num = scn.nextInt();
			sum += num;
			System.out.println("입력값은 "+ num);
			
			if (sum > 100) {
				sum -= num;
				System.out.println("100초과하여서 종료 합니다.");
				isTrue = false;
			}else {
				
			}

		} while (isTrue);
		// 누적값이 100을 초과하기 전의 값을 출력
		System.out.println("sum의 누적값: " + sum); 
		
		System.out.println("end of prog");
	}
}
