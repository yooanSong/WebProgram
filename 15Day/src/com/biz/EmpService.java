package com.biz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dao.EmpDAO;
import com.entity.EmpDTO;

public class EmpService {
	public
	List<EmpDTO>
	salEmpXXX
	(HashMap<String, ArrayList<EmpDTO>> map){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list = session.selectList("salEmpXXX", map);
		}finally{
			session.close();
		} return list;
	}//end insert
	
	
	//List<EmpDTO> <>이게 제네릭 , 저장되는 자료형을 강제적으로 지정해주는 것 
	//메소드, 자료형, 변수명 
	//selectInSal는 아이디값, map는 selectInSal의 파라미터값 
	public List<EmpDTO> selectInSal(HashMap<String, ArrayList<Integer>> map){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list = session.selectList("selectInSal", map);
		}finally{
			session.close();
		} return list;
	}//end insert
	
	
	public List<EmpDTO> selectSal(HashMap<String, Integer> map){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list = session.selectList("selectSal", map);
		}finally{
			session.close();
		} return list;
	}//end insert
	
	
	
	
	
	//PAGING 처리할때 필요한 것 : 시작과  몇개부터 뽑겠다는 것을 알려줘야 한다 	
	public List<EmpDTO> salPaging(int start, int len){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list= session.selectList("salPaging", null, new RowBounds(start, len)); 
			//rowbounds를 안쓰면 list 14개가 나온다 즉 어떤 list 메소드를 쓰는냐에 따라 달라진다  
		}finally{
			session.close();
		} return list;
	}//end insert
	
	
	public int empCount(){
		SqlSession session = EmpDAO.openSession();
		int count = 0;
		try{
			 count= session.selectOne("myemp.empCount");   //아이디 값은 empMapper에 있는 empCount			
		}finally{
			session.close();
		}
		return count;
	}//end insert
	
	public void delete(){}
	public void update(){}
	public void select(){}
	

}
