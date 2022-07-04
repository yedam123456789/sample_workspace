package cd.edu;

public class Example03 {
	public static void main(String[] args) {
		// 월 => 30일, 31일, 28일
		int mouth = (int) (Math.random() * 12) + 1;
		System.out.println(mouth);

		int lastDate = -1;
		if (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 || mouth == 8 || mouth == 10 || mouth == 12) {
			lastDate = 31;
		} else if (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11) {
			lastDate = 30;
		} else {
			lastDate = 28;
		}
		System.out.println(mouth + "월은 " + lastDate + " 가 말일 입니다.");

		switch (mouth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDate = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30;
			break;
		default:
			lastDate = 28;

		}System.out.println(mouth + "월은 " + lastDate + " 이 말일 입니다.");
	}
}
