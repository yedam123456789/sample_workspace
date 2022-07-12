package co.edu.collect.board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		// 메뉴선택 => 선택값 => 구현
		BoardDAO app = BoardDAO.getInstance();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			System.out.println("선택하세요>> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				List<Board> b = app.boardList();
				for (Board board : b) {
					System.out.println("제목은 " + board.getTitle() + "작성자는 " + board.getWriter());
				}
			} else if (selectNo == 2) {
				System.out.println("제목을 입력하세요.> ");
				String title = scn.nextLine();
				System.out.print("작성자를 입력하세요.> ");
				String writer = scn.nextLine();
				System.out.print("내용을 입력하세요.> ");
				String content = scn.nextLine();
				app.add(new Board(title, writer, content));
			} else if (selectNo == 3) {
				System.out.print("검색할 작성자를 입력> ");
				String writer = scn.nextLine();
				List<Board> list = app.search(writer);
				for (Board board : list) {
					System.out.println(board.toString());
				}

			} else if (selectNo == 4) {
				System.out.print("삭제할 제목을 입력");
				String title = scn.nextLine();
				app.remove(title);
				System.out.println("삭제 되었습니다.");
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료합니다.");
				break;
			}

		}
		System.out.println("프로그램을 종료함");
	}

}
