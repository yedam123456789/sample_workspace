package co.edu;

import java.util.Scanner;

public class home {
	public static void main(String[] args) {

		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int MAX = 0;
		boolean run = true;
		int[] price = null;
		String[] goods = null;
		int good = 0;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.상품수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1:
				// 작성위치
				System.out.print("상품수 입력=> ");
				good = Integer.parseInt(scn.nextLine());
				price = new int[good];
				goods = new String[good];
				break;
			case 2:
				// 작성위치
				System.out.println("상품을 입력하세요");
				for (int i = 0; i < goods.length; i++) {
					goods[i] = scn.nextLine();

				}
				System.out.println("가격을 입력하세요");
				for (int i = 0; i < price.length; i++) {
					price[i] = Integer.parseInt(scn.nextLine());
				}

				break;
			case 3:
				// 작성위치
				System.out.println("제품별 가격");
				for (int i = 0; i < price.length; i++) {
					System.out.println("상품명 : " + goods[i] + " 가격: " + price[i]);

				}
				break;
			case 4:
				// 작성위치
				for (int i = 0; i < price.length; i++) {
					if (MAX < price[i]) {
						MAX = price[i];
						sum += price[i];
					}

				}
				for (int i = 0; i < good; i++) {

					if (price[i] == MAX) {

						System.out.println("최고가격는->" + MAX + ", 상품이름은-> " + goods[i] + ", 상품 나머지총합= " + (sum - MAX));
					}
				}

				break;

			case 5:
				// 작성위치
				run = false;
				System.out.println("프로그램 종료중. . .");
				break;
			}
		}
		System.out.println("완전종료");
	}
}
