package first;

public class Service {
	//OracleDAO dao;
	MysqlDAO dao;
	public void connect(MysqlDAO dao){
		this.dao=dao;
		//dao.connectOracle();
		dao.connectMysql();
		
	}

}
