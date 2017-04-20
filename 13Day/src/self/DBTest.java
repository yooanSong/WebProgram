package self;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {
	
	public static void main(String[] args){
	String driver= "oracle.jdbc.driver.OracleDriver";
	String url= "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid= "scott";
	String passwd= "tiger";
	
	Connection con =null;
	PreparedStatement pstmt = null;

	
	try {
		Class.forName(driver);
		con= DriverManager.getConnection(url, userid, passwd);
		String sql = "delete from dept where deptno = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, 40);
		int n =pstmt.executeUpdate();
		
		if(n==1){
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally{
		try{
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
		
		
	}
}
