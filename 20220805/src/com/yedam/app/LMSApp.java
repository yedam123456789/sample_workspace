package com.yedam.app;

import java.util.Scanner;

import com.yedam.member.MemberDTO;
import com.yedam.member.MemberService;
import com.yedam.student.StudentDTO;
import com.yedam.student.StudentService;

public class LMSApp {

	MemberService ms = new MemberService();
	StudentService ss = new StudentService();
	Scanner scn = new Scanner(System.in);
	int menu = 0;

	MemberDTO MD = null;

	public LMSApp() {
		run();
	}

	private void run() {

		// 로그인 되지 않았을때
		while (true) {
			menuNo();
			if (MD == null) {

				// 로그인 진행
				if (menu == 1) {
					MemberDTO member = new MemberDTO();

					System.out.println("아이디 입력 >");
					String id = scn.nextLine();
					System.out.println("비번 입력 >");
					String pw = scn.nextLine();

					member.setMemberId(id);
					member.setMemberPw(pw);

					MD = ms.doLoing(member);

				} else if (menu == 2) {
					System.out.println("프로그램 종료");
					break;
				}
			} else {
				// 등록
				if (menu == 1) {
					StudentDTO std = new StudentDTO();

					System.out.println("ID"); // ID
					int id = Integer.parseInt(scn.nextLine());
					System.out.println("이름"); // Name
					String name = scn.nextLine();
					System.out.println("강의실"); // Class
					String lecture = scn.nextLine();
					System.out.println("주소"); // addr
					String addr = scn.nextLine();
					System.out.println("전화번호"); // tel
					String tel = scn.nextLine();

					std.setStudentId(id);
					std.setStudentName(name);
					std.setStudentClass(lecture);
					std.setStudentAddr(addr);
					std.setStudentTel(tel);

					ss.insertStudent(std);
				}
				// 성적입력
				else if (menu == 2) {
					// 존재하면
					StudentDTO std = new StudentDTO();
					System.out.println("ID 입력");
					int id = Integer.parseInt(scn.nextLine());

					std.setStudentId(id);

					std = ss.getStudent(std);
					if (std != null) {
						ss.insertSubject(std);
					} else {
						System.out.println("정보 없음");
					}

				}
				// 정보입력
				else if (menu == 3) {
					ss.updateTel();

				}
				// 정보 조회
				else if (menu == 4) {
					StudentDTO std = new StudentDTO();

					System.out.println("입력");
					int id = Integer.parseInt(scn.nextLine());

					std.setStudentId(id);

					std = ss.getStudent(std);

					System.out.println("");
				}
				// 프로그램 진입
			}

		}

	}

	private void menuNo() {
		if (MD == null) {
			System.out.println("1.로그인 | 2.종료");
			System.out.println("입력>>>>>");
			menu = Integer.parseInt(scn.nextLine());
		} else {
			System.out.println("1. 학생등로 | 2. 성적입력 |  3. 학생 정보 수정 | 4. 학생정보 조회");
			menu = Integer.parseInt(scn.nextLine());
		}
	}
}
