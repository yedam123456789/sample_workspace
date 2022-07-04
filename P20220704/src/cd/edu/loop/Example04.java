package cd.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// while 반복문의 종료조건
		// 1~100 임의의 수를 생성.
		Scanner scn = new Scanner(System.in);
		int temp = 90;
		int inputVal = 0;
		boolean isTrue = true;
		

			if (inputVal == temp) {
				System.out.println("맞췄습니다.");

				if (inputVal == 9) {
					System.out.println("반복문을 종료합니다.");
					isTrue = false;
				}

			} else if (inputVal > temp) {

			} else if (inputVal < temp) {

			}
		}

	}

