package self;

public class TestEmployee2 {

	public static void main(String[] args) {
		Manager2 m = new Manager2("홍길동", "S001", 1000, "개발");
		Engineer2 eng = new Engineer2("이순신", "S002", 2000);
		Employee2 e = new Employee2("유관순", "S003", 3000);
		
		System.out.println(m.getEmployee());
		System.out.println(eng.getEmployee());
		System.out.println(e.getEmployee());

		
		
		

	}

}
