package first;

public class TestMain {

	public static void main(String[] args) {
		Service s = new Service();
		//s.connect(new OracleDAO());
		s.connect(new MysqlDAO());


	}

}
//first의 단점
//하나가 변경되니깐 
//메소드가 다 다르니깐 다 알아야 함 