package com.biz;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

public class DeptService {
	public void insert(DeptDTO dto) {
		SqlSession session = DeptDAO.openSession();
		try {
			// int n = session.insert("aaa"); //n = 몇개의 행이 insert됬는지 그래서 숫자
												// 문자열 하나는 넘겨줄 데이터가 없다는 것 , sql문이 항상 고정된 값일때 
			int n2 = session.insert("dept.bbb", dto); // 두번째 인자에는 하나의 dept정보이다
														// 이건 dto에 저장한걸 넣어주면 됨
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // catch문 없으니 반드시 실행하는 목적
			session.close(); // pool에서 빌린걸 반납하는 것
		}

	}

	public void update(DeptDTO dto) {
		SqlSession session = DeptDAO.openSession();
		try {
			int n = session.update("deptUpdate", dto);
		session.commit();

		} finally {
			session.close();
		}
	}

	public void delete(int deptno) {
		SqlSession session = DeptDAO.openSession();
		try {
			int n = session.delete("deleteByDeptno", deptno);
			session.commit();

		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public DeptDTO selectByDeptno(int deptno) {
		SqlSession session = DeptDAO.openSession();
		DeptDTO dto= null;
		try {
			dto=session.selectOne("selectByDeptno", deptno);
		} finally {
			session.close();
		} return dto;
	}
	
	public List<DeptDTO> selectALL() {
		SqlSession session = DeptDAO.openSession();
		List<DeptDTO> list = null;
		try {
			list= session.selectList("selectALL");
		} finally {
			session.close();
		}return list;
	}//end selectAll

}
