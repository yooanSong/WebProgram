package com.biz;

import org.apache.ibatis.session.SqlSession;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

public class DeptService {
	public void insert(DeptDTO dto){
		SqlSession session = DeptDAO.openSession();
		try{
			int n2= session.insert("dept.bbb", dto);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

}
