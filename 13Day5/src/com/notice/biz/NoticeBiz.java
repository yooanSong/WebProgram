package com.notice.biz;


import java.sql.Connection;
import java.util.ArrayList;

import com.common.util.CommonUtil;
import com.common.util.JdbcTemplate;
import com.employee.entity.Employee;
import com.employee.exception.DataNotFoundException;
import com.notice.dao.NoticeDAO;
import com.notice.entity.Notice;




public class NoticeBiz implements INoticeBiz {

   NoticeDAO dao;
   
	
	public NoticeBiz() {
		dao = new NoticeDAO();
	}//end 생성자
	
	//공지사항 목록보기
	public ArrayList<Notice> selectAllNotice() {
		Connection con = JdbcTemplate.getConnection();
		ArrayList<Notice> list =  dao.selectAllNotice(con);
		JdbcTemplate.close(con);
		return list;
	}
	
	//공지사항 자세히 보기
	public Notice selectDetailNotice(String noticeNum)throws DataNotFoundException{
		Notice result = null;
		Connection con = JdbcTemplate.getConnection();
		result=  dao.selectDetailNotice(con,noticeNum);
		JdbcTemplate.close(con);
		return result;
	}
	
	
	 //공지사항 수정하기
	 public void noticeUpdate(Notice notice){

		    Connection con = JdbcTemplate.getConnection();
			dao.noticeUpdate(con,notice);
			JdbcTemplate.commit(con);
			JdbcTemplate.close(con);
			
		
		}//noticeUpdate
	 
	 //공지사항 삭제
	 public void noticeDelete(String inputNum) throws DataNotFoundException{
		 Connection con = JdbcTemplate.getConnection();
			dao.noticeDelete(con,inputNum);
			JdbcTemplate.commit(con);
			JdbcTemplate.close(con);
			
	 }
	 
}//end class
