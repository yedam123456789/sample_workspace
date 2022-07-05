package cd.edu;

public class MethodExamp01 {
	public static void main(String[] args) {
		// 실행구문
//		long sum = sum(10); // arguments 9매개값)
//		showlnfo("홍길동", 18);
		// showlnfo("김두영", 26);
//		PrintStar(5, "♥");
		for (int i = 2; i<= 9; i++)
		printGugudan(i);
	}

	public static void printGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+" * "+i+"= "+i*j );
				System.out.print("   ");
			}
//			System.out.println("3 * " + i + " = " + i * 3);
			System.out.printf("%d * %d = %2d\t ",dan,i,(dan * i));
		}
		System.out.println();

	}

//	public static void PrintStar(int times, String shape) {
//		for (int i = 0; i < times; i++) {
//
//			System.out.print(shape);
//		}System.out.println();
//		for (int i = 1; i <= times; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(shape);
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= times; i++) {
//			for (int j = 5-i; j > 0; j--) {
//				if (j > i) {
//					System.out.print(" ");
//				} else
//					System.out.print("♥");
//			}
//		}
//
//	}

	public static void showlnfo(String name, int age) {
		System.out.println("안녕하세요. " + name + "입니다. 나이는 " + age + "살 입니다.");

	}

	public static long sum(int num) { // parameter(매개변수
		int result = num * 2;
		return (long) result; // 자동형변환(promotion)
	}

}
