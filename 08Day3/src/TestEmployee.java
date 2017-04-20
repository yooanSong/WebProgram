
public class TestEmployee {

	public static void main(String[] args) {
		Manager m = new Manager("홍길동", "S001", 1000, "개발");
		Engineer eng = new Engineer("이순신", "S002", 2000);
		Employee e = new Employee("유관순", "S003", 3000);
	
		m.taxRate(m);
		eng.taxRate(eng);
		e.taxRate(e);

	}

}
