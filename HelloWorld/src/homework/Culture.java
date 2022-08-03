package homework;

public abstract class Culture {
	protected String title;
	protected int drenum;
	protected int achnum;
	protected int wachnum;
	protected int totalScore;

	public Culture(String title, int drenum, int achnum) {
		this.title = title;
		this.drenum = drenum;
		this.achnum = achnum;

	}

	public void setTotalScore(int score) {
		wachnum++;
		totalScore += score; 
	}

	public String getGrade() {
		int avg = totalScore / wachnum;
		String grade = null;
		switch (avg) {
		case 1:
			grade ="★☆☆☆☆";
			break;
		case 2:
			grade ="★★☆☆☆";
			break;
		case 3:
			grade ="★★★☆☆";
			break;
		case 4:
			grade ="★★★★☆";
			break;
		case 5:
			grade ="★★★★★";
			break;
		}
		return grade;
	}

	public abstract void getInformation();

}
