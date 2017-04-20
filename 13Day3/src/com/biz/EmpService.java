package com.biz;

import java.sql.Connection;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.RecordNotFoundException;

//트랜잭션 및 여러가지 기능 구현
// Connection 필요
public class EmpService {

	public ArrayList<EmpDTO> select(){
		//Connection은 로컬변수로 작성
        Connection con = JdbcTemplate.getConnection();
        EmpDAO dao = new  EmpDAO();
        ArrayList<EmpDTO> list = dao.select(con);
		JdbcTemplate.close(con);
		return list;
	}
	public void insert(EmpDTO dto){
		Connection con = JdbcTemplate.getConnection();
		EmpDAO dao = new  EmpDAO();
		dao.insert(con, dto);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}//end 
	public void delete(int deptno)
			throws RecordNotFoundException{
        Connection con = JdbcTemplate.getConnection();
        EmpDAO dao = new  EmpDAO();
		dao.delete(con, deptno);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}
	public void update(){
        Connection con = JdbcTemplate.getConnection();
		
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}
}
