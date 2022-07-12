package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 이름 점수 => map저장
 * 김민수, 80/황현익,75/이현승 88
 * Scanner 클래스입력 > 학생이름 입력 -> 점수반환.
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김민수", 80);
		map.put("황현익", 75);
		map.put("이현승", 88);
		Scanner scn = new Scanner(System.in);

		// 출력결과:
		// 평균점수: 81
		// 최고점수: 88 ,최고점수 학생의이름 이현승
		System.out.println("출력결과: " + map);

		int Max = 0;
		Set<Entry<String, Integer>> Set1 = map.entrySet();
		for (Entry<String, Integer> ent : Set1) {
			if (ent.getValue() >= Max) {
				Max = ent.getValue();
			}

		}
		System.out.println("최고점수: "+ Max);

		// 학생이름으로 검색.
		System.out.println("학생이름입력 ");
		String name = scn.nextLine();

		Set<Entry<String, Integer>> Set = map.entrySet();

		for (Entry<String, Integer> ent : Set) {
			if (ent.getKey().equals(name)) {
				System.out.println("학생의 점수: " + ent.getValue());
			}

		}

	}
}
