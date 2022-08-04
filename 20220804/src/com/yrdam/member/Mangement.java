package com.yrdam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class Mangement {
	public class Management extends DAO {

		public Management() {
			// 전체 조회
			showInfo();
			// 한건 조회
			getMember();
			// 한건 입력
			insertInfo();
			// 수정
			updateInfo();
			// 삭제
			deleteInfo();

		}

		private void deleteInfo() {
			int result = 0;
			try {
				conn();
				String sql = "delete from member where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "A");
				result = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (result == 1) {
					System.out.println(result + " 건이 삭제됨");
				} else {
					System.out.println("삭제가 되지않음");
				}

			}
		}

		// 수정
		private void updateInfo() {
			int result = 0;
			try {
				// 1. DB
				conn();
				// 2.query
				String sql = "update member set pw=? where id = ?";
				// 3. 창구 및 쿼리 생성
				pstmt = conn.prepareStatement(sql);
				// 4.데이터 입력
				pstmt.setString(1, "4321");
				pstmt.setString(2, "A");

				result = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			if (result == 1) {
				System.out.println(result + "수정됨");
			} else {
				System.out.println("수정되지 않음");
			}
		}

		private void insertInfo() {
			int result = 0;
			try {
				// 1. db연결
				conn();
				// 2. query작성
				String sql = "insert into member values (?,?,?)";

				// 3. 창구 생성
				pstmt = conn.prepareStatement(sql);
				// 4. query 데이터 입력
				pstmt.setString(1, "F");
				pstmt.setString(2, "1234");
				pstmt.setString(3, "김씨");
				// DML (insert, update, delete) -> executeUpdate()

				// Select -> executeQuery()
				result = pstmt.executeUpdate();

			} catch (Exception e) {

			} finally {
				disconnect();
			}
			if (result == 1) {
				System.out.println("정상입력됨");
			} else {
				System.out.println("입력에 실패됨");
			}

		}

		// 한건 조회
		private void getMember() {
			Member member = null;
			try {
				// 1.DB연결
				conn();
				// 2. query문 작성
				String sql = "select * from member where id =?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "A");
				rs = pstmt.executeQuery();

				if (rs.next()) {
					member = new Member();
					member.setId(rs.getString("id"));
					member.setName(rs.getString("name"));
					member.setPw(rs.getString("pw"));
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			System.out.println("----------------------------------");
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println(member.toString());

		}

		// 전체 조회
		// Member 여러 건
		private void showInfo() {
			List<Member> list = new ArrayList<>();
			Member mem = null;

			try {
				// 1. conn()메소드로 DB연결
				conn();

				// 2.query 작성
				String sql = "select * from member";

				// 3. 연결된 DB에 query문 보낼 수 있는 창구 생성
				stmt = conn.createStatement();

				// 4. 3번에서 만든 창구로 query문을 보냄
				// ResultSet(rs) select 조회할때만 사용
				rs = stmt.executeQuery(sql);

				while (rs.next()) {
					mem = new Member();
					mem.setId(rs.getString("id"));
					mem.setName(rs.getString("name"));
					mem.setPw(rs.getString("pw"));
					list.add(mem);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}

			for (Member member : list) {
				System.out.println(member.toString());
			}

		}

	}
}
