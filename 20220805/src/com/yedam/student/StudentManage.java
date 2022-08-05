package com.yedam.student;

import com.yedam.common.DAO;

public class StudentManage extends DAO {

	private static StudentManage sm = new StudentManage();

	private StudentManage() {

	}

	static StudentManage getInstance() {
		return sm;
	}
	/*
	 * 학생등록 성적입력 정보 수정 정보 조회
	 */

	public int insertStudent(StudentDTO std) {
		int result = 0;
		try {
			conn();

			String sql = " insert into student\r\n"
					+ "(student_id,student_name, student_class, student_addr,stduent_tel)  " +"values(?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentClass());
			pstmt.setString(4, std.getStudentAddr());
			pstmt.setString(5, std.getStudentTel());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

//	성적입력
//	국,수
	public int insertKor(StudentDTO std) {
		int result = 0;
		try {
			conn();

			String sql = " update student set student_kor =? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentKor());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}

	public int insertEng(StudentDTO std) {
		int result = 0;
		try {
			conn();

			String sql = " update student set student_Eng =? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentEng());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	public int insertMath(StudentDTO std) {
		int result = 0;
		try {
			conn();

			String sql = " update student set student_Math =? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentMath());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	public int updateTel(StudentDTO std) {
		int result = 0;
		try {
			conn();

			String sql = " update student set student_Tel =? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getStudentTel());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}

	public StudentDTO getStudent(int id) {
		StudentDTO std = null;
		try {

			conn();
			String sql = "select * from student where student_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				std = new StudentDTO();
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_Name"));
				std.setStudentTel(rs.getString("student_Tel"));
				std.setStudentAddr(rs.getString("student_addr"));
				std.setStudentClass(rs.getString("student_Class"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return std;
	}

}
