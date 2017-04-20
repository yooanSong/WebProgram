package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.RecordNotFoundException;

public class EmpDAO {
	public void slectByDeptno(Connection con, int deptno) {

	};

	public ArrayList<EmpDTO> slect(Connection con) {
		ArrayList<EmpDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select loc,lower(dname) dn,deptno xxx from mydept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt("xxx");
				String dname = rs.getNString("dn");
				String loc = rs.getNString("loc");
				EmpDTO dto = new EmpDTO(deptno, dname, loc);
				list.add(dto);
			} // end while
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}

		return list;

	};

	public void insert(Connection con, EmpDTO dto) {
		String sql = "insert into mydept (deptno, dname, loc)" + " values(?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			pstmt.setInt(1, dto.getDeptno());
			int n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	};

	public void delete(Connection con, int deptno)
	throws RecordNotFoundException{
		String sql = "delete from mydept where deptno=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);			
			pstmt.setInt(1, deptno);
			int n = pstmt.executeUpdate();
			if(n==0)throw new RecordNotFoundException(deptno+"에 해당하는 레코드가 없습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	};

	public void update() {
	};

}
