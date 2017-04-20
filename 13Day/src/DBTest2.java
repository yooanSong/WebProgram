import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest2 {

	public static void main(String[] args) {
		//1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);			
			con =DriverManager.getConnection(url, userid, passwd);			
			String sql = "insert into mydept (deptno, dname, loc)"+ " values(?, ?, ?)"; //?의 index는 1,2,3 
			
			pstmt = con.prepareStatement(sql);		
			pstmt.setInt(1, 50);
			pstmt.setString(2, "인사");
			pstmt.setString(3, "서울");	
			
			int n = pstmt.executeUpdate(); 
			
			pstmt.setInt(1, 60);
			pstmt.setString(2, "인사");
			pstmt.setString(3, "서울");
			int n2 = pstmt.executeUpdate(); 
			
			if(n==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");
			}
			
			if(n2==1){  //n2 변경된게 1개일때 
				System.out.println("n2성공");
			}else{
				System.out.println("n2실패");
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
