import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest5 {
//트랜잭션 
	public static void main(String[] args) {
		// 1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";

		// 2. 드라이버 로딩
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, userid, passwd);

			// auto commit 비활성화
			con.setAutoCommit(false);

			String sql = "delete from mydept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 10);
			int n = pstmt.executeUpdate();

			String sql2 = "delete from mydept where deptno = ?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, 20);
			int n2 = pstmt.executeUpdate(); // 10번, 20번이 rollback되기때문에 둘다 삭제 안됨
			//
			con.commit();

		} catch (ClassNotFoundException e) {

		}

		catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}// end main

}
