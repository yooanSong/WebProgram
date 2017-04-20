package self;

public class TestEmployee2_1 {

	public static void main(String[] args) {
		//다형성 적용
		
		Employee2 emp = new Manager2("홍길동", "S001", 1000, "개발");
		System.out.println(emp.name);
		System.out.println(emp.get);

	}

}
