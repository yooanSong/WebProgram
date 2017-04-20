package com.biz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dao.EmpDAO;
import com.entity.EmpDTO;

public class EmpService2 {

public void insertMulti(ArrayList<EmpDTO> xxx){
		
		SqlSession session = EmpDAO.openSession();
		try{
		  int n = session.insert("insertMulti", xxx);
		  session.commit();
		}finally{
			session.close();
		}
    }//end 
	
	
	

    public void delMulti(ArrayList<Integer> xxx){
		
		SqlSession session = EmpDAO.openSession();
		try{
		  int n = session.delete("delMulti", xxx);
		  session.commit();
		}finally{
			session.close();
		}
    }//end 
	
		
	public List<EmpDTO> searchMulti(ArrayList<Integer> xxx){
		
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
		  list = session.selectList("searchMulti",xxx);			
		}finally{
			session.close();
		}
		return list;
}//end 
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<EmpDTO> searchEname(EmpDTO dto){
		
			SqlSession session = EmpDAO.openSession();
			List<EmpDTO> list = null;
			try{
			  list = session.selectList("searchEname",dto);
				
			}finally{
				session.close();
			}
			return list;
	}//end 
}
