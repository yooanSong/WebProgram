package com.biz;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dao.EmpDAO;
import com.entity.EmpDTO;

public class EmpService {
	/*public List<EmpDTO> salPaging(int start, int len){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list= session.selectList("salPaging", null, new RowBounds(start, len)); 
			//rowbounds를 안쓰면 list 14개가 나온다 즉 어떤 list 메소드를 쓰는냐에 따라 달라진다  
		}finally{
			session.close();
		} return list;
	}//end insert
*/
	//int 처음시작, int몇번째 알려주는 값
	public List<EmpDTO> salPaging(int start, int len){
		SqlSession session = EmpDAO.openSession();
		List<EmpDTO> list = null;
		try{
			list= session.selectList("salPaging", arg1, arg2)
		}
		
	}
	
	
	
	
	
}
