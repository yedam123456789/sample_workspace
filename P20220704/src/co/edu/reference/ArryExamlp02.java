package co.edu.reference;

public class ArryExamlp02 {
	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
//	배열의 크기: 5, intAry.lengt
//	25보다 큰 수만 출력
//		위치 세번째 => 15->30;
		intAry[2] = 30;
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			//if(i % 2 == 0) {
//				System.out.println(intAry[i]);
			//}
			sum += intAry[i];
		}
		System.out.println("합계: "+sum);
	}
}
