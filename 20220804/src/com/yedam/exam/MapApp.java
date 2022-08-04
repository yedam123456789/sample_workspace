package com.yedam.exam;

import java.util.HashMap;
import java.util.Scanner;

public class MapApp {

	HashMap<String, String> map = new HashMap<>();
	Scanner scn = new Scanner(System.in);
	String menuNo = " ";

	public MapApp() {
		run();
	}

	private void run() {
//		menuNo="10"
//		menuNo.equals("10") => true
//		!menuNo.equals("10") => false
		while (!menuNo.equals("10")) {
			System.out.println("1. 단어 등록 2. 단어전체 조회 3. 단어 검색 4. 단어 수정" + "5. 단어 삭제 10.종료");
			System.out.println("입력> ");
			menuNo = scn.nextLine();
			// 단어등록
			if (menuNo.equals("1")) {
				String word = " ";
				while (true) {
					System.out.println("단어 입력. 종료 할려면 당근을 흔들어");
					System.out.println("입력> ");
					word = scn.nextLine();
					if (word.equals("당근"))
						;
					{

					}
					break;

				}
				System.out.println("뜻 입력> ");
				String mean = scn.nextLine();
				map.put(word, mean);
			}

			// 전체 조회
			else if (menuNo.equals("2"))

			{
				if (map.size() == 0) {
					System.out.println("등록된 단어가 없음");
				} else {
					System.out.println("*******예담 단어장********");
//					1. 항샹된 for문을 이용해 key를 가져옴
//					2. 가져온 key를 활용하여 value가져옴
					for (String key : map.keySet()) {
						String value = map.get(key);
						System.out.println("단어 : " + key + "\n 뜻 :  " + value);

					}
				}

			}
			// 검색
			else if (menuNo.equals("3")) {
				System.out.println("단어 입력> ");
				String key = scn.nextLine();
				if (map.containsKey(key)) {
					String value = map.get(key);
					System.out.println("단어 : " + key + "\n 뜻 :  " + value);
				} else {
					System.out.println("등록되지 않은 단어임");
				}
				// 수정
			} else if (menuNo.equals("4")) {
				System.out.println("수정 단어 입력> ");
				String key = scn.nextLine();
				if (map.containsKey(key)) {
					System.out.println("수정 할 뜻");
					String value = scn.nextLine();
					map.put(key, value);
				} else {
					System.out.println("등록되지 않은 단어임");
				}

			}
			// 삭제
			else if (menuNo.equals("5")) {
				System.out.println("1.한건 삭제 2. 전체 삭제");
				System.out.println("입력 ");
				String menu = scn.nextLine();

				if (menu.equals("1")) {
					System.out.println("삭제 단어 입력> ");
					String key = scn.nextLine();
					map.remove(key);
					if (!map.containsKey(key)) {
						System.out.println("삭제 완료");
					} else {
						System.out.println("삭제 되지 않음 . 관리자한태 문의 ㄱ");
					}
				} else if (menu.equals("2")) {
					map.clear();
					if (map.size() == 0) {
						System.out.println("전체 삭제 완료");
					} else {
						System.out.println("삭제 되지 않음 . 관리자한태 문의 ㄱ");
					}
				}
			}
		}
	}
}
