package co.edu.compound;

public class Friendmain {
	public static void main(String[] args) {
		
		Friend f1=new Friend();
		f1.name = "훈";
		f1.birthday = 3/15;
		f1.email = "naver@naver.com";
		f1.height = 176.4;
		f1.weight = 60.2;
		f1.tell = 010-123-456;
		
		
		f1.showInfo("훈",25);
		f1.Email("naver@naver.com");
		f1.Birthday(0);
		f1.setHeight(0);
	}

}
