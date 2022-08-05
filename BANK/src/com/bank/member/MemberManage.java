package com.bank.member;

import com.bank.common.DAO;

public class MemberManage extends DAO {

	// 싱글
	private static MemberManage mm = new MemberManage();

	private MemberManage() {

	}

	public static MemberManage getInstance() {
		return mm;
	}

	public Member loginInfo(String id) {
		Member member = null;
		try {
			conn();
			// id -> pk
			// 1 row
			// id /pw/..../
			String sql = "select *from bankmember where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setRole(rs.getString("role"));

				// member.setAccountId(rs.getString("account_id"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;
	}

	// 고객 등록 메소드
	public int registerCustomer(Member member) {
		int result = 0;
		try {
			conn();
			String sql = " insert into bankmember(member_id , member_ps,member_name ,member_role) values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getRole());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	public void transferMoney(String toAccount, String fromAccount, int balance) {

		int result = 0;

		try {

			conn();

			String sql2 = "update account set balance = balance-? where account_id=? ";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, balance);
			pstmt.setString(2, fromAccount);
			result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("정상");
				//
				String sql = "update account set balance = balance+? where account_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, toAccount);
				int result2 = pstmt.executeUpdate();
				if (result2 == 1) {
					System.out.println("계좌 이체 완료");
				} else {
					System.out.println("계좌 이제 실패");
				}

			} else {
				System.out.println("실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
