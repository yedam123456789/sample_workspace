package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

/*
 * 등록 조회 수정 삭제 리스트
 * id:user1 passwd: 1212 => 로그인 되었습니다.
 * 로그인 실패시 -> 아이디와 비밀번호을 확인하세요
 */
public class BoardApp {
	public static void main(String[] args) {

		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);

//		로그인 처리 기능.
		boolean ent = true;
		String id = "user1";
		String passwd = "1212";
		while (ent) {
			System.out.println("로그인 하세요 ");
			System.out.println("ID: ");
			id = scn.nextLine();
			System.out.println("비밀번호를 입력하세요");
			passwd = scn.nextLine();
			System.out.println("로그인 되었습니다.");
			if (id.equals("user1") && passwd.equals("1212")) {
				System.out.println();

			}
		}
		boolean run = true;

		while (run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.리스트 6.종료");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				// 게시글 등록 (제목,내용,작성자,작성일시,조회수(0));
				System.out.println("글제목을 입력하세요.");
				String title = scn.nextLine();
				System.out.println("글내용을 입력하세요.");
				String content = scn.nextLine();
				System.out.println("글작성자를 입력하세요.");
				String writer = scn.nextLine();

				Board board = new Board();

				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);

				// 배열의 비어있는 위치에 저장.

				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board; // 비어있는 위쳉 한건 저장.
						break;
					}
					System.out.println("정상적으로 입력했습니다.");
				}

			} else if (selectNo == 2) {
//				게시글 조회: 제목조회.
				System.out.println("조회할 제목을 입력해주세요 > ");
				String findTite = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTite)) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자 %s, 작성일지 %s, 조회수 %s \n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateDate(),
								boards[i].getHitCount());

						// 카운터 증가
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
						System.out.println();
					}
				}

			} else if (selectNo == 3) {
				System.out.println("수정할 제목을 입력하세요. >");
				String findTite = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTite)) {
						System.out.println("제목을 입력하세요.");
						String title = scn.nextLine();
						System.out.println("내용을 입력하세요.");
						String content = scn.nextLine();

						boards[i].setTitle(title);
						boards[i].setContent(content);
						System.out.println("수정이 완료 되었습니다.");
					}

				}

				System.out.println("수정이 완료되었습니다.");
			} else if (selectNo == 4) {
				System.out.println("삭제할 제목을 입력하세요 > ");
				String findTite = scn.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTite)) {
						boards[i] = null;
						System.out.println("삭제 되었습니다.");
					}
				}

			} else if (selectNo == 5) {
				// 전체 리스트
				System.out.println("=======글목록=======");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자 %s, 작성일지 %s, 조회수 %s \n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getCreateDate(),
								boards[i].getHitCount());
					}
				}
			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다...");
				run = false;
			}
		}

	}

}
