import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest4 {

	public static void main(String[] args) {
		//1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		//2. 드라이버 로딩 
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		try {
			Class.forName(driver);
			
			//3. Connection 맺기
			con =DriverManager.getConnection(url, userid, passwd);
			
			//4.sql문 작성
			String sql = "select loc,lower(dname) dn,deptno xxx from mydept"; 
			
			//5. sql문 전송하기 위한 객체 생성 ( PreparedStatement)
			pstmt = con.prepareStatement(sql);
						
			
			//6.sql문 전송 (auto commit)
			rs=pstmt.executeQuery(); 
			while (rs.next()) {
				int deptno = rs.getInt("xxx"); //rs.getInt(3) 알리아스(xxx)
				String dname= rs.getNString("dn");  //컬럼명주는걸 권장. 가독성위해서
				String loc= rs.getNString("loc");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
				
			}//end while
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{ 
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	
		

	}//end main

}
