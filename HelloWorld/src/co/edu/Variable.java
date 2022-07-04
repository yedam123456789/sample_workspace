package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 10; // -128~127
		short s1 = -32768; // -32.768~32767
		int n1 = 0; // -2147483648~2147483647
		long l1 = 8; // 
		
		int result = b1 + 20; // (int) b1 + 20; 
		long result1 = l1 + (long) 20; // 데이터타입 변환 : 자동형변환(promotion)
		result = (int)l1 + 20; // 데이터탑인 변환 : 강제형변환(casting)
		System.out.println(result);
		System.out.println(result1);
		
		
		char c1 = 'A';
		for (int i = 0; i < 27; i++)
		System.out.println((int) c1++);

		
		//이력변경추가 2022.07.01.12:55
		System.out.println("이력변경추가.  ");

		// 깃에서 수정한 작업입니다.
		System.out.println("깃에서 작업함");

	}

}