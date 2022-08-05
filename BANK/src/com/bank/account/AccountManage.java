package com.bank.account;

import java.util.Scanner;

import com.bank.common.DAO;

public class AccountManage extends DAO {
	Scanner scn = new Scanner(System.in);
	private static AccountManage am = new AccountManage();

	private AccountManage() {

	}

	public static AccountManage getInstance() {
		return am;
	}

	public int insertAccount(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "insert into account (account_id , member_id) values('?','?')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getAccountId());
			pstmt.setString(2, account.getMemberId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 입출금
	public int updateMoney(Account account, int cmd) {
		int result = 0;
		try {
			conn();
			// 입출금 업뎃
			// 계산한 데이터를 바로 넣어 주면 끝
			// 다른 연산 필요없이 가능
			// 현재 잔고를 가져오는 쿼리문
			String sql2 = "select balance from account where account_id = ? ";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, account.getAccountId());
			rs = pstmt.executeQuery();

			int balance = 0;
			if (rs.next()) {
				rs.getInt(balance);
			}
			// 잔고 계산
			// 입금1 출금2
			if (cmd == 1) {
				// balane현제 잔고
				// account.getBalance() 내가 입금하고자하는 금액
				// 1+2 = 입금한금액
				account.setBalance(balance + account.getBalance());
			} else if (cmd == 2) {
				// 잔고>출금액
				if (balance - account.getBalance() >= 0) {
					account.setBalance(balance - account.getBalance());

					String sql = " update account set balance =? where account_id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, account.getBalance());
					pstmt.setString(2, account.getAccountId());
					result = pstmt.executeUpdate();

				}
				// 잔고 < 출금액
				else {
					System.out.println("잔고가 출금액보다 많음");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 해지
	public int delAccount(String accountId) {
		int result = 0;
		try {
			conn();
			String sql = "select from account where account_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountId);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	public void transfer() {
		System.out.println("!이체!");

		System.out.println("받는 사람계좌");
		String toaccountId = scn.nextLine();

		System.out.println("보내는 사람계좌");
		String fromaccountId = scn.nextLine();

		System.out.println("출금 금액");
		int balance = Integer.parseInt(scn.nextLine());

		AccountManage.getInstance().transferMoney(toAccountId, fromAccount_id, balance);

		// -계좌이체-
		// 1. 받는 사람 계좌
		// 2. 보내는 사람 계좌
		// 3. 보내는 사람의 비밀번호(join) 또는 select 계좌와 비밀번호가 맞는지
		// 데이터 유효성 검사.
		// 4. 출금 금액

	}

}
