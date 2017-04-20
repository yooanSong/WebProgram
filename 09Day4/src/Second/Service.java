package Second;

public class Service {
	//OracleDAO dao;
	//MysqlDAO dao;
	DAO dao;
	public void connect(DAO dao){
		this.dao=dao;
		//dao.connectOracle();
		//dao.connectMysql();
		dao.connect();
		
	}

}
