
public class TestStudent2 {

	public static void main(String[] args) {
		/* object의 toString()메서드
		-문자열로 변환시키는 메서드
		-참조변수가 가지고 있는 주소값을 문자열로 변환할때 사용한다 
		따라서 참조변수를 System.out.println();하면 자동으로 호출된다. 
		
		toString 오버라이딩 용도
		-디버깅용
		
		*/
		
		Person p= new Person("이순신", 22, "전라", "123456789");
		System.out.println(p); 
		//참조변수를 출력하면 내부적으로 .toString이 붙어서 출력된다 (주소값은 object에 있는것) 
		//실제 데이터가 나오게끔 재정의해서 쓰자 
		
		
		
		String s = "hello";
		System.out.println(s);
		System.out.println(s.toString());
		//string이니깐 api이다 즉, 재정의 해서 썼기에 @이가 나온게 아니라 실제데이터가 출력됬다 
		
	}//end main
}
	
