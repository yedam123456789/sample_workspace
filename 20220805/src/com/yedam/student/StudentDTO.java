package com.yedam.student;

public class StudentDTO {
//	STUDENT_ID    NOT NULL NUMBER(5)     
//	STUDENT_NAME  NOT NULL VARCHAR2(10)  
//	STUDENT_CLASS          VARCHAR2(15)  
//	STUDENT_ADDR  NOT NULL VARCHAR2(100) 
//	STDUENT_TEL            VARCHAR2(15)  
//	STDUENT_KOR            NUMBER        
//	STDUENT_EMG            NUMBER        
//	STDUENT_MATH           NUMBER  

	private int studentId;// 학번
	private String studentName;// 학생이름
	private String studentClass;// 강의실
	private String studentAddr; // 주소
	private String studentTel; // 전화번호
	private int studentKor; // 국어
	private int studentEng; // 영어
	private int studentMath; // 수학

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public String getStudentTel() {
		return studentTel;
	}

	public void setStudentTel(String studentTel) {
		this.studentTel = studentTel;
	}

	public int getStudentKor() {
		return studentKor;
	}

	public void setStudentKor(int studentKor) {
		this.studentKor = studentKor;
	}

	public int getStudentEng() {
		return studentEng;
	}

	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}

	public int getStudentMath() {
		return studentMath;
	}

	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}

	@Override
	public String toString() {
		return "StudentDTO [학번=" + studentId + ", 이름=" + studentName + ", 강의실=" + studentClass + ", 주소=" + studentAddr
				+ "]";
	}

}
