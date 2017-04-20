
public class TestEmployee2 {

	public static void main(String[] args) {
		//다형성 적용
		//큰타입 = 작은타입;
		
		Employee emp = new Manager("홍길동", "S001", 1000, "개발");
		System.out.println(emp.name);
		System.out.println(emp.getEmployee()); //동적 바인딩 
		//컴파일할때는 employee를 호출했는데 실행할때는 Manager를 호출한다
		//즉, 동적바인딩은 실행할때 메소드 이름을 동일하지만 서로 다른 기능을 하는 
		// 메소드를 묶어서 그것을 호출한다  
		
		// 변수에서는 동적바인딩이 안 일어난다 메소드에서만 일어난다!!! 
				emp = new Engineer("이순신", "S002", 2000);
				emp = new Employee("유관순", "S003", 3000);

	}//end main

}
