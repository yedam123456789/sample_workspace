package co.edu;

public class Example02 {
	public static void main(String[] args) {
				
	
		
		double myheight = 190.5;
		double yourheight = 180.7;
		
		double theDifference = 0;
		
		
		
		if (myheight < yourheight) {
			System.out.println("나의 키가 더 크다.");
		}
			else {
				theDifference = myheight - yourheight;
				System.out.println("나의 키가 더 작다.");
			}
		
	
		if (myheight < yourheight) {
			System.out.println("나의 키가" + theDifference + "더 크다.");
		}
			else {
				theDifference = yourheight - myheight;
				System.out.println("나의 키가" + theDifference + "더 작다.");
				
			}
			}
		
				
	}



