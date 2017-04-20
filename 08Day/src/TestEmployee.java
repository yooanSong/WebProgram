
public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager("홍길동", "S001", 1000, "개발");
		Engineer eng = new Engineer("이순신", "S002", 2000);
		Employee e = new Employee("유관순", "S003", 3000);
		
		System.out.println(m.getEmployee());
		System.out.println(eng.getEmployee());
		System.out.println(e.getEmployee());

		
		//manager 생성자를 호출한것 
		//-> employee에서 선언했으니 employee생성자가 먼저 호출됨
		
		/*super 쓰는 경우 2가지 
		 * 1 부모 변수명과 자식 변수명이 동일할 때 : super. 부모 명시적으로 준다/ this.은 자식임 
		 * 2 부모 생성자를 호출할 때 
		 * 		: 부모생성자는 호출이 안되니까 명시적으로 super.써서 호출
		 * 		: 묵시적으로 호출하려면 자식 생성자를 호출하면 된다    
		 *  */

	}

}
