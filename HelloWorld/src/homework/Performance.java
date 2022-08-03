package homework;

public class Performance extends Culture{
	 
	
	public Performance(String title, int drenum, int achnum) {
		super(title, drenum, achnum);
	}

	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + title);
		System.out.println("감독수 : " + drenum);
		System.out.println("배우수 : " + achnum);
		System.out.println("영화총점수 : " + totalScore);
		System.out.println("영화평점 : " + getGrade());
	}
}
  