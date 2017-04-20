//재사용 클레스 (학생객체)
public class Student {
	// 인스턴스 변수 (메서드 밖에서 선언된 변수 인스턴스변수, static변수)
	// 현실세계에서 필요한 객체를 뽑아와 인스턴스 변수로 만든다
	private String name;
	//String name;
	private int age;
	private String address;

	// 메서드
	// 1 변수에 (인스턴스변수)에 값을 설정하는 메서드: setter메서드
	public void setName(String name) {
		this.name = name;
		//String name;
		int s=0;
	}

	// 검증 코드 구현 메서드
	private boolean validAge(int a) {
		boolean result = false;
		
		if (a < 100)
			result = true;

		return result;
	}
	// 내(해당Class)안에 있으면 그냥 호출하면 되고 내 안에 없으면(다른 class)
	// 	-> 1. 객체생성, Person s = new Person();
	//	-> 2. 접근을 해줘야 한다 
	/* 은닉화란? 
		-public, private으로 구현한다
		-은닉화의 장점 :
	 	접근 하는 쪽- private을 주면 외부에서 안봐도 되는 것들 안볼 수 있어 좋아
		접근 당하는 쪽- 검증을 해서 올바른 데이터 설정 가능하다
*/
	public void setAge(int a) {
		if (validAge(a)) {
		//if(a<100){	
		age = a;
		} else {
			System.out.println("잘못된 age 설정");
		}
	}

	public void setAddress(String a) {
		address = a;
	}

	public void setNameAddress(String n, String a) {
		name = n;
		address = a;
	}

	public void setNameAge(String n, int a) {
		name = n;
		age = a;
	}

	public void setNameAgeAddress(String n, int a, String d) {
		name = n;
		age = a;
		address = d;
	}

	// 2 변수에 저장된 값을 조회하는 메서드: getter메서드
	/*
	 * public 리턴타입 getName(변수,변수2){ return 값; }
	 */
	// 변수에 있는 원하는 데이터 조회하기 위해서
	// 리턴타입 필요함 문자열이니깐 String / 리턴타입이 필요없으면 void

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// 생성자

}
