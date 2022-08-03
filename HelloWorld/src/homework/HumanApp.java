package homework;

public class HumanApp {
	public static void main(String[] args) {
		Human man = new StandardWeightInfo("홍길동", 168, 45);
		man.getInformation();

		Human man1 = new ObesityInfo("박둘이", 168, 90,0);
		man1.getInformation();
	} 
}
