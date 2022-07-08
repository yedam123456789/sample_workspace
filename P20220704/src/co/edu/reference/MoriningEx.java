package co.edu.reference;

import java.util.Scanner;

public class MoriningEx {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		boolean run = true;
		int studentNum = 0; // 학생수
		int[] scores = null; // 참조변수 초기화.

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("\n1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");

			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine()); // nextLine =int, nextLine =>String

			if (selectNo == 1) {
				System.out.print("학생수 입력 ->");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다.");

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>" + scores[i] + "\n");

				}

			} else if (selectNo == 4) {
				int Max = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > Max) {
						Max = scores[i];
					}
				}
				System.out.println("총합 " + sum + " 최대값 " + Max);

				double avg = (double) sum / scores.length;
				System.out.println("평균값" + avg);

			} else if (selectNo == 5) {
				System.out.print("프로그램을 종료합니다.");
				run = false;
			}

		}
		System.out.println();
	}
}
