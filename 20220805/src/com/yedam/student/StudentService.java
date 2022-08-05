package com.yedam.student;

import java.util.Scanner;

public class StudentService {
	Scanner scn = new Scanner(System.in);

	public void insertStudent(StudentDTO std) {
		int result = StudentManage.getInstance().insertStudent(std);
		if (result == 1) {
			System.out.println("정보 입력 성공");
		} else {
			System.out.println("정보 입력 실패");
		}
	}

	public void insertSubject(StudentDTO std) {
		// 성적 입력 국어 영어 수학
		int menu = 0;
		System.out.println("성적입력");
		System.out.println("1.국어 2. 영어 3.수학");
		menu = Integer.parseInt(scn.nextLine());
		System.out.println("입력");
		if (menu == 1) {
			int kor = Integer.parseInt(scn.nextLine());
			// 국어점수 입력
			std.setStudentKor(kor);
			StudentManage.getInstance().insertKor(std);

		} else if (menu == 2) {
			int eng = Integer.parseInt(scn.nextLine());
			std.setStudentEng(eng);
			StudentManage.getInstance().insertEng(std);

		} else if (menu == 3) {
			int math = Integer.parseInt(scn.nextLine());
			std.setStudentMath(math);
			StudentManage.getInstance().insertMath(std);
		}
	}

	public void updateTel() {

		StudentDTO std = new StudentDTO();
		System.out.println("ID입력");
		int id = Integer.parseInt(scn.nextLine());
		System.out.println("변경할 전화번호 입력");
		String tel = scn.nextLine();

		std.setStudentId(id);
		std.setStudentTel(tel);

		int result = StudentManage.getInstance().updateTel(std);
		checkResult(result);
	}

	public StudentDTO getStudent(StudentDTO std) {

		return StudentManage.getInstance().getStudent(std.getStudentId());
	}

	private void checkResult(int value) {
		if (value == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}

}
