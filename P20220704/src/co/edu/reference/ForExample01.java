package co.edu.reference;

public class ForExample01 {
	public static void main(String[] args) {

//	배열
		int[] tempAry = new int[5];
//		tempAry = new int[] { 3, 4, 5, 6, 7 };
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50);
		}

//		제일 큰값 MAX;

		for (int num : tempAry) {
			System.out.println(num);
		}
		int Min = 0;
		for (int i = 1; i < tempAry.length; i++) {
			if (Min < tempAry[i]) {
				Min = tempAry[i];
			}
		}
		System.out.println("제일 큰값: " + Min);
	}

}