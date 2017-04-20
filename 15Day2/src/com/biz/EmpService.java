package com.biz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dao.EmpDAO;
import com.entity.EmpDTO;

public class EmpService {

	public List<EmpDTO> 
	salEmpXXX(HashMap<String, ArrayList<EmpDTO>> map){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
		   list = session.selectList("salEmpXXX", map);
			
		}finally{
			session.close();
		}
		return list;
	}//end insert
	
	
	
	
	
	
	
	
	
	public List<EmpDTO> 
	selectInSal(HashMap<String, ArrayList<Integer>> map){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
		   list = session.selectList("selectInSal", map);
			
		}finally{
			session.close();
		}
		return list;
	}//end insert
	
	
	
	
	
	
	
	
	
	
	public List<EmpDTO> 
	   selectSal(HashMap<String, Integer> map){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
		   list = session.selectList("selectSal", map);
			
		}finally{
			session.close();
		}
		return list;
	}//end insert
	
	
	
	
	
	public List<EmpDTO> salPaging(int start, int len){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
		 	list = 
	session.selectList("salPaging", null, 
			 new RowBounds(start, len));
			
		}finally{
			session.close();
		}
		return list;
	}//end insert
	
	
	public int empCount(){
		SqlSession session = EmpDAO.openSession();
		int count = 0;
		try{
		  count = session.selectOne("myemp.empCount");
		}finally{
			session.close();
		}
		return count;
	}//end insert
	
	
	
	
	
	
	
	
	
	public void insert(){
		SqlSession session = EmpDAO.openSession();
		try{
			
			
		}finally{
			session.close();
		}
	}//end insert
	public void delete(){}
	public void update(){}
	public void select(){}
	
}
