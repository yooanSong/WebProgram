package com.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//EmpDAO 역할은 딱 한가지 SqlSessionFactory 얻기 
public class EmpDAO {
	private static SqlSessionFactory sqlSessionFactory ; //인스턴스 변수니깐 static변수로 만들고 외부에서 접근 못하게 private함 
	static {
		String resource = "com/config/Configuration.xml";  //xml파일과 값 주고 받고 해야 하니깐 /로 적음 java내부인경우는 . 씀 
		InputStream inputStream=null;
		try {
			inputStream =Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);	 //내가 만든 메소드 
	}
	public static SqlSession openSession(){
		return sqlSessionFactory.openSession(); //만들어놓은걸 가져온 메소드 
	}

	

}
