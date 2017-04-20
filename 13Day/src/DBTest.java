import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {

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
			String sql = "delete from mydept where deptno = ?"; //바인딩 변수는 나중에 값을 넣어줌 리터럴값 위치에만 ? 쓴다
			
			//5. sql문 전송하기 위한 객체 생성 ( PreparedStatement)
			pstmt = con.prepareStatement(sql); //	인자는 sql문
			pstmt.setInt(1, 40); //1부터 시작
			
			//6.sql문 전송 (auto commit)
			int n = pstmt.executeUpdate(); //자동으로 커밋이 된다
			
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
