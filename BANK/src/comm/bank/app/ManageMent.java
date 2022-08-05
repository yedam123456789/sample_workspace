package comm.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.member.MemberService;

public class ManageMent {
	Scanner scn = new Scanner(System.in);

	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	int menuNo = 0;

	public ManageMent() {
		bankjob();
	}

	private void bankjob() {
		menuInfo();
		while (true) {
			if (MemberService.memberInfo.getRole().equals("1")) {
				if (menuNo == 1) {
					// 고객등록
					ms.registerCustomer();
				} else if (menuNo == 2) {
//					계좌개설
					as.makeAccount();
				} else if (menuNo == 3) {
//					//일출금
					as.meney();
				} else if (menuNo == 4) {
					as.
				} else if (menuNo == 5) {
					as.deletAccount();
				} else if (menuNo == 6) {

				}
			}
		}

	}

	private void menuInfo() {
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("1.고객 등록 | 2. 계죄 개설 | 3. 입금/출금 4.계좌이체" + " | 5.계좌 해지 | 6.대출");
		} else if (MemberService.memberInfo.equals("0")) {
			System.out.println("1.게좌 조회 | 2. 입금 | 3. 출금 | 4.계좌이체 | 5.대출");
		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(scn.nextLine());
	}
}
