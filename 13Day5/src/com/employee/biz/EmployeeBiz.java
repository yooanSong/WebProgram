package com.employee.biz;


import java.sql.Connection;
import java.util.ArrayList;

import com.common.util.CommonUtil;
import com.common.util.JdbcTemplate;
import com.employee.dao.EmployeeDAO;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;


public class EmployeeBiz implements IEmployeeBiz {

	
    EmployeeDAO dao;

    

	public EmployeeBiz() {
		dao = new EmployeeDAO();
	}

	// 사원 목록 보기
	@Override
	public ArrayList<Employee> selectAllEmployee() {
		Connection con = JdbcTemplate.getConnection();
		ArrayList<Employee> list =  dao.selectAllEmployee(con);
		JdbcTemplate.close(con);
		return list;
	}

	// 사원정보 검색하기
	@Override
	public ArrayList<Employee> searchList(String inputSubMenu, String searchWord) throws DataNotFoundException {
		Connection con = JdbcTemplate.getConnection();
		ArrayList<Employee> list = dao.searchList(con, inputSubMenu, searchWord);
		JdbcTemplate.close(con);
		return list;
	}//end printSearchList
	
	@Override
	public int createEmployeeNum(){
		Connection con = JdbcTemplate.getConnection();
		int n = dao.createEmployeeNum(con);
		JdbcTemplate.close(con);
		return n;
	}

   //새로운 사원 생성
	@Override
	public void employeeInsert(Employee emp){
		Connection con = JdbcTemplate.getConnection();
		dao.employeeInsert(con, emp);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}

   //사원 수정
	@Override
	public void employeeUpdate(Employee emp) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		dao.employeeUpdate(con, emp);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}//end employeeUpdate
	

	//사원 삭제
	 @Override
	public void employeeDelete(int empno)throws DataNotFoundException{
		 Connection con = JdbcTemplate.getConnection();
			dao.employeeDelete(con, empno);
			JdbcTemplate.commit(con);
			JdbcTemplate.close(con);
	}//end employeeDelete
	
	
	//근태관리( 외출/출장/휴가/근무)
	 @Override
	public void employeeService(int empno, String inputColumn)throws DataNotFoundException{
		 Connection con = JdbcTemplate.getConnection();
			dao.employeeService(con, empno,inputColumn);
			JdbcTemplate.commit(con);
			JdbcTemplate.close(con);
	 }
	
}// end class





