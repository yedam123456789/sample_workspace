package com.bank.account;

import java.util.Scanner;

public class AccountService {
	Scanner scn = new Scanner(System.in);

	public void makeAccount() {
		Account ac = new Account();

		System.out.println("계좌 번호 ");
		String accountId = scn.nextLine();

		System.out.println("고객 아이디 ");
		String customId = scn.nextLine();

		ac.setAccountId(accountId);
		ac.setMemberId(customId);

	}

	public void meney() {

		Account account = new Account();

		System.out.println("1.입금 | 2.출금 ");
		int cmd = Integer.parseInt(scn.nextLine());

		System.out.println("계좌번호 ");
		String accountId = scn.nextLine();
		if (cmd == 1) {
			System.out.println("입금액");

		} else if (cmd == 2) {
			System.out.println("출금액");
		}
		int money = Integer.parseInt(scn.nextLine());

		account.setAccountId(accountId);
		account.setBalance(money);

		int result = AccountManage.getInstance().updateMoney(account, cmd);

		if (result == 1 && cmd == 1) {
			System.out.println("입금 완료");
		} else if (result == 1 && cmd == 2) {
			System.out.println("출금 완료");
		}

	}

	// 3.계좌 해지 -> delete

	public void deletAccount() {

		System.out.println("===================계좌 해지===================  ");
		System.out.println("계좌입력  ");
		String accountId = scn.nextLine();

		int result = AccountManage.getInstance().delAccount(accountId);

		if (result == 1) {
			System.out.println("정상 해지");
		} else {
			System.out.println("해지되지 않음");
		}
	}

}
