//Student 클래스 관리 (생성, 변수초기화, 변수값조회, 변경...등)
public class TestStudent2 {

	public static void main(String[] args) {
		// Student s = new Student(); 객체생성
		// 멤버변수(인스턴스변수)는 직접 접근하지 않는다
		// 올바른 데이터 설정목적
		// -멤버변수 직접 접근 금지
		// -메서드 통해서 접근(검증코드 추가가능)
		// s.age=200;
		// System.out.println(s.age);

		Student s = new Student();
		s.setName("홍길동");
		s.setAddress("서울");
		s.setAge(200);
		String name = s.getName(); //리턴값이 만들어지니간 그걸 담을 변수를 하나 만든것 
		int age = s.getAge();
		
		System.out.println(name);
		System.out.println(age);

		//s.validAge(a);
		/*s.setNameAddress("이순신","전라");
		s.setNameAge("홍길동",20);
		s.setNameAgeAddress("홍길동",20,"서울");*/
		
		// s. student에 있는 setName에 있는
		// 메서드를 호출한것 그러면서 홍길동이란 리턴값을 넘겨준것
		// 멤버변수로 직접 접근이 불가하니깐 메서드를 이용한것
		// 중간에 저장하는 임시저장소가 필요 그 변수가 n

	}// end main

}// end class
