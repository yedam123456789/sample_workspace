package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {
	public static int sumAry(int[] ary) {
		int sum =0;
		for(int i=0; i< ary.length; i++) {
			sum += ary[i];
		}
		return sum; // 메소드를 호출한 영역으로 sum을 출력
	}
	
public static void main(String[] args) {
//	메소드 호출구문
//	int result =sumAry[10];
//	result = sumAry[20];
//	System.out.println("결과값: "+ result);
	
//	배열 합계.
	int sum =0;
	double avg=0;
	
	int[] intAry = {34,23,56,22,99,28};
//	intAry 배열의 합과 평균.
//	sum = sumAry(intAry);
//	avg = (double) sum/ intAry.length;
//	System.out.printf("intAry 배열의 합 : %d, 평균: %.1f\n"+sum,avg);
	int[] intArray = new int[6];
	for(int i= 0; i<intArray.length; i++) {
		intArray[i] = (int)(Math.random()*100)+1;		
	}
	int[] ScanArray = new int[5];
	Scanner scn = new Scanner(System.in);
	for(int i = 0; i< ScanArray.length; i++) {
		System.out.println("임의의 수를 입력>>>");
		
		ScanArray[i] =scn.nextInt(); 
	}
//	scanArray배열의 합과 평균

	for (int i= 0; i<ScanArray.length; i++) {
		sum +=ScanArray[i];
		
	}
		System.out.println("sum: "+sum);
		
		for(int i = 0; i< ScanArray.length; i++) {
					avg = (double) sum/ ScanArray.length;	
		}
		
		System.out.println("avg: " + avg);
}
}
