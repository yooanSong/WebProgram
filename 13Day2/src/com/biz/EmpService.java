package com.biz;

import java.sql.Connection;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.RecordNotFoundException;

//트랜잭션 및 여러가지 기능 구현  (매서드와 중간 역할 해주는 것) 
//Connection 필요
public class EmpService {

	public ArrayList<EmpDTO> select() {
		// Connection은 로컬변수로 작성
		// update delete 하면 같은 Connection을 사용하니깐 서로 꼬일 수 있다
		// 데이터 무결성 원칙이 지켜지지 않는다 공유하지 말고 각각 Connection 주기

		Connection con = JdbcTemplate.getConnection();
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpDTO> list = dao.slect(con);
		JdbcTemplate.close(con);
		return list;
	};

	public void insert(EmpDTO empDTO) {
		Connection con = JdbcTemplate.getConnection();
		EmpDAO dao = new EmpDAO();
		dao.insert(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	};

	public void delete(int deptno) 
		throws RecordNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		EmpDAO dao = new EmpDAO();
		dao.delete(con, deptno);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	};

	public void update() {
	};

}
