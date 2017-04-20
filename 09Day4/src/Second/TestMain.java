package Second;

public class TestMain {

	public static void main(String[] args) {
		Service s = new Service();
		//s.connect(new OracleDAO());
		//s.connect(new MysqlDAO());
		s.connect(new MSSQL());


	}

}
