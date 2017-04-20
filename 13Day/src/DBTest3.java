import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest3 {

	public static void main(String[] args) {
		//1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		//2. 드라이버 로딩 
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			
			//3. Connection 맺기
			con =DriverManager.getConnection(url, userid, passwd);
			
			//4.sql문 작성
			String sql = "update mydept set dname = ? , loc =?" + "where deptno = ?"; 
			
			//5. sql문 전송하기 위한 객체 생성 ( PreparedStatement)
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "인사2");
			pstmt.setString(2, "서울2");
			pstmt.setInt(3, 50);			
			
			//6.sql문 전송 (auto commit)
			int n = pstmt.executeUpdate(); 
			
			
			if(n==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{ 
			try {
				if(pstmt!=null)pstmt.close();
				if(pstmt!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	
		

	}//end main

}
