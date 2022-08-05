package com.bank.member;

import java.util.Scanner;

public class MemberService {

	public static Member memberInfo = null;
	Scanner scn = new Scanner(System.in);

	// 로그인
	public void doLogin() {
		Member member = new Member();

		System.out.println("ID입력");

		String id = scn.nextLine();

		System.out.println("PW입력");

		String pw = scn.nextLine();

		// 1 row
		// id / pw / ..../
		member = MemberManage.getInstance().loginInfo(id);

		// DB 조회한 정보와 내가 입력한 PW 비교
		if (member.getMemberPw().equals(pw)) {
			memberInfo = member;
		} else {
			System.out.println("실패");
		}

	}

	// 로그아웃
	public void logout() {
		memberInfo = null;
	}

	// 고객 등록
	public void registerCustomer() {
		Member member = new Member();
		System.out.println("고객 아이디 입력");
		String id = scn.nextLine();
		System.out.println("고객 비번 입력");
		String pw = scn.nextLine();
		System.out.println("고객 이름 입력");
		String name = scn.nextLine();

		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");

		int result = MemberManage.getInstance().registerCustomer(member);

		if (result == 1) {
			System.out.println("고객 정보 등록 완료");
		} else {
			System.out.println("고객 정보 등록 실패");
		}
	}

}
