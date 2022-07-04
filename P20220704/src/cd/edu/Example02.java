package cd.edu;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100 ~ 90사이: A ~80: B , 70: C ~그외: D
		// 출력값: 점수는 78은 c등급입니다.
		Scanner Scanner = new Scanner(System.in);

		int num = Scanner.nextInt();
		String grade = "";

		if (num >= 90 && num <= 100) {
			if (num >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (num >= 80) {
			if (num >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (num >= 70) {
			if (num >= 75) {
				grade = "C+";
			} else {
				grade = "c";
			}
		} else {
			grade = "D";

		}
		System.out.println("점수 " + num + "는 " + grade + " 입니다.");

	}
}