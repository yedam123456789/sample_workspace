package com.yedam.member;

public class MemberDTO {
//	MEMBER_ID     NOT NULL VARCHAR2(20)  
//	MEMBER_PW     NOT NULL VARCHAR2(20)  
//	MEMBER_NAME   NOT NULL VARCHAR2(10)  
//	MEMBER_BELONG          VARCHAR2(100) 

	private String memberId; // member_id 회원아이디
	private String memberPw; // member_pw 회원 비번
	private String memberName; // member_Name 회원 이름
	private String memberBelong; // member_belong 회원 소속

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberBelong() {
		return memberBelong;
	}

	public void setMemberBelong(String memberBelong) {
		this.memberBelong = memberBelong;
	}

}
