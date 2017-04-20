package script;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductManager {
	private Connection con;

	public ProductManager() {
		// JDBC 드라이버 및 DB URL 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@192.168.0.100:1521:VCC";
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		try {
			// JDBC 드라이버 로딩
			Class.forName(driver);
			// CONNECTION 획득(본인의 계정 입력)
			// con = DriverManager.getConnection(url, "student##", "student##");
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch (Exception e) {
			System.out.println("DB CONN ERR : " + e.getMessage());
		}
	}
	public Connection getConnection(){
		return con;
	}
}
