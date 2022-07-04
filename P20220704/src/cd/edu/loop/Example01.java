package cd.edu.loop;

public class Example01 {
	public static void main(String[] args) {
		// 3 for 10번 반복
		// 1 num 변수 <= 1 ~10 까지의 임의 정수. math.random();
		// 2 sum 변서 <= 2의 배수.
		// 2의 배수의 합:
		int num = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("2의 배수의 합은 "+ sum);
	}
}
