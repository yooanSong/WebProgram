package com.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeptDAO {
	private static SqlSessionFactory sqlSessionFactory; // 인스턴스 변수니깐 static변수로
														// 만들고 외부에서 접근 못하게
														// private함
	static {
		String resource = "Configuration.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); // 내가
																				// 만든
																				// 메소드
	}

	public static SqlSession openSession() {
		return sqlSessionFactory.openSession(); // 만들어놓은걸 가져온 메소드
	}

	// http://www.mybatis.org/mybatis-3/ko/getting-started.html
	// 홈페이지에서 2번째거 복사한거를 static에 붙여넣고 import 받는데 첫번째페이지 맨위에꺼랑 두번째 페이지 밑에껄
	// import받는다
	// 에러 클릭해서 try/catch문 만들고 그 다음 inputStream = null; 값을 준다

	// EmpDAO 역할은 딱 한가지 SqlSessionFactory 얻기
	// DAO라는 한 테이블에 뽑아 낸것
	// SqlSessionFactory 이게 결국 service에서 사용된다 / 테이블을 접근할때 마다 service를 만들어야 하니깐
	// 중복 될 수 있어서
	// 13라인에 private 으로 묶었으니깐 접근 가능하도록 30라인에 해당하는 메소드를 만들어준것
	/* public static SqlSession openSession(){ return sqlSessionFactory.openSession();
	 */

}
