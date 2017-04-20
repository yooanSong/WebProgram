package com.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.EmpDAO;
import com.entity.EmpDTO;

public class EmpService2 {

	public void insertMulti(ArrayList<EmpDTO> xxx){		 //여러개 삭제 
		SqlSession session = EmpDAO.openSession();
		
		try{
			int n = session.insert("insertMulti", xxx);
			session.commit();
		}finally{
			session.close();
		} 
	}	
	
	
	
	
	public void delMulti(ArrayList<Integer> xxx){		 //여러개 삭제 
		SqlSession session = EmpDAO.openSession();		
		try{
			int n = session.delete("delMulti", xxx);
			session.commit();
		}finally{
			session.close();
		} 
	}	
	
	
	public List<EmpDTO> searchMulti(ArrayList<Integer> xxx){		
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list= session.selectList("searchMulti", xxx);  // Ename에 값이 안 담겨있어서 전체를 가져오는 것 
		}finally{
			session.close();
		} return list;
	}
	
	
	
	public List<EmpDTO> searchEname(EmpDTO dto){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list= session.selectList("searchEname", dto);  // Ename에 값이 안 담겨있어서 전체를 가져오는 것 
		}finally{
			session.close();
		} return list;
	}

}
