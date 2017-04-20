//동등비교 
//두개의 인스턴스가 같은 거야? 물어봤다 -> 같냐를 물어보니 동등비교 
public class TestStudent {
	public static void main(String[] args) {
		
		Person p= new Person("이순신", 22, "전라", "123456789");
		Person p2= new Person("이순신", 22, "전라", "123456789");
		System.out.println(p.equals(p2));
		System.out.println();
	
		Student s = new Student("홍길동", 100, 100, 100);
		Student s2 = new Student("홍길동", 100, 100, 100);
		
		//1.연산자
		System.out.println(s==s2); //s가 참조형,즉 클래스다 결국 주소값 비교
		
		//2.equals 메서드
		System.out.println(s.equals(s2));
		//s가 가리키는 값과 s2가 가리키는 값을 비교해라 
		//object에 있는 equals메소드를 그냥 가져다 쓰면 s==s2 이거랑 같다 
		//즉, 이것도 주소값 비교
		// 실제 값 비교를 하게끔 오버라이딩을 해야한다 
		
		System.out.println();
		String a = "hello";
		String a2 = "hello";
		System.out.println(a==a2);
		System.out.println(a.equals(a2));
		//a와 a2의 리터럴을 저장하는 경우는 동일한 문자열이면 
		//한번만 만들어지고 새로 생성하지 않고 공유해서 같이씀 즉, 주소값이 같다 
		
		String b = new String("hello");
		String b2 = new String("hello");
		System.out.println(b+"\t"+b2);
		System.out.println(b==b2);
		System.out.println(b.equals(b2));
		//new로 생성하는 경우는 heap메모리에 올라가고 b와 b2의 주소값이 다르다
		//동일한 문자열이더라도 다른데 저장되고 매번 만들어진다   
		//String은 API이다 그래서 알아서 재정의 한다 따로 안해줘도됨

	}//end main

}//end class 

