package com.yrdam.member;

import java.util.List;
import java.util.Scanner;

public class Application {
	Scanner scn = new Scanner(System.in);

	public Application() {
		run();
	}

	private void run() {
		boolean flag = true;
		while (flag) {

			System.out.println(" 1.전체 조회 2.단건 조회 3. 회원조회 4. 회원수정" + "5.회원 삭제 6.종료");

			System.out.println("입력> ");

			int menuNo = Integer.parseInt(scn.nextLine());

			switch (menuNo) {
			case 1:
				List<Member> list = MemberManagement.getInstance().getMemberList();
				if (list.size() == 0) {
					System.out.println("데이터가 한 건도 없습니다.");
				} else {
					for (Member member : list) {
						System.out.println(member.toString());
					}

				}
				break;
			case 2:
				System.out.println("조회할 Id입력>");
				String id = scn.nextLine();
				Member member = MemberManagement.getInstance().getMember(id);

				if (member == null) {
					System.out.println("등록되지 않는 아뒤");

				} else {
					System.out.println(member.toString());
				}
				break;

			case 3:
				Member member2 = new Member();
				System.out.println("====회원등록====");
				System.out.println("id> ");
				String str = scn.nextLine();
				member2.setId(str);

				System.out.println("Pw> ");
				String str2 = scn.nextLine();
				member2.setPw(str2);

				System.out.println("이름 ");
				String str3 = scn.nextLine();
				member2.setName(str3);

				int result = MemberManagement.getInstance().insertMember(member2);
				if (result == 1) {
					System.out.println(result + " 정상 입력");
				} else {
					System.out.println("입력 실패");
				}
				break;
			case 4:
				Member member3 = new Member();
				System.out.println("=====회원수정======");

				System.out.println(" 수정ID ");
				String str4 = scn.nextLine();
				member3.setId(str4);
				System.out.println("수정 PW");
				String str5 = scn.nextLine();
				member3.setPw(str5);
				int result2 = MemberManagement.getInstance().updateMember(member3);
				if (result2 == 1) {
					System.out.println(result2 + " 수정됨");
				} else {
					System.out.println("수정 실패");
				}

				break;
			case 5:
				System.out.println("삭제");
				System.out.println("삭제 ID>");
				String str6 = scn.nextLine();
				int result3 = MemberManagement.getInstance().deleteMember(str6);
				if (result3 == 1) {
					System.out.println(result3 + " 정상");
				} else {
					System.out.println("실패");
				}
				break;
			case 6:
				System.out.println("프로그램 종료");
				flag = false;
			}
		}

	}

}
