package homework;

import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int [][] lottono =null;
		int money;
		
		
		while (run) {
			System.out.println("1.구매 2.번호추첨 3.종료");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1:
				System.out.println("금액 입력: ");
				System.out.println("얼마 넣으시겠습니까? ");
				money=Integer.parseInt(scn.nextLine());
				  
				break;
			case 2:
				
				
			case 3:
				run = false;
				System.out.println("종료");
				break;
			
			}
		}
	}
}
