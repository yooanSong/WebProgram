package script;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductManagerMain {

	public static void main(String[] args) throws SQLException {
			ProductManager pm=new ProductManager();
			Connection con=pm.getConnection();
			System.out.print("매출 조회 메뉴 - [ 매출 일자순  : 1, 상품별 매출순 : 2  ]: ");
			int menu=InputUtil.readNumber();
			String sql="";
			if(menu==1){
				sql=" SELECT TO_CHAR(ODATE, 'YYYY-MM-DD') 영업일, SUM(O.QUANTITY*P.PRICE) 매출 "
						+ "FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY ODATE ORDER BY 1";
			}else if(menu==2){
				sql="SELECT PNAME 상품명, SUM(O.QUANTITY*P.PRICE) 매출 "
						+ "FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY PNAME ORDER BY 2 DESC";
			}
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			System.out.println("--------------------------------------");
			System.out.println(((menu==1)?"영업일":"상품명")+"\t\t\t매출");
			System.out.println("--------------------------------------");
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
			}
			System.out.println("--------------------------------------");
	}

}
