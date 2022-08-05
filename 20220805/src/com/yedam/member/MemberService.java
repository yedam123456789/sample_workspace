package com.yedam.member;

public class MemberService {

	public MemberDTO doLoing(MemberDTO member) {
		MemberDTO mem = MemberManage.getInstance().login(member);
		if (mem == null) {
			System.out.println("로그인 안됨");
			return null;
		} else {
			System.out.println("로그인 됨");
			return mem;
		}
	}

}
