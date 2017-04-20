package com.notice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.employee.util.JdbcTemplate;
import com.notice.entity.Notice;

public class NoticeDAO {
	ArrayList<Notice> selectAllNotice(Connection con) {
		ArrayList<Notice>list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			String sql = "select no, title, content, author, to_char(writeday, 'YYYY-MM-DD')writeday from notice order by no desc";
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()){
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String author = rs.getString("author");
				String writeday = rs.getString("writeday");
				Notice notice = new Notice(no, title, content, author, writeday);
				list.add(notice);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}
	/*Notice selectDetailNotice(Connection con, String noticeNum) {
		Notice result = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			String sql = ""
		}
		return null;
	}*/
	void noticeUpdate(Connection con, Notice notice) {
	}
	void noticeDelete(Connection con, String inputNum) {
	}
	

}
