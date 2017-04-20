
public class WrapperTest {

	public static void main(String[] args) {
		//정수값 100 생성방법 2가지 
		int n = 100; //기본형 이용방법 
		Integer n2 = new Integer(100); //참조형 이용 
		System.out.println(n);
		System.out.println(n2);
		
		//오토박싱 : 값만 변하는 것 
		//자바가 버전업 되면서 가능  (Wrapper클래스 타입은 참조형, 기본형 데이터와 호환해서 사용하기 위해 ) 
		int x = n2; //Integer==> int로 자동 바뀐거 ( UnBoxing) 
		Integer x2= x; //int ==> Integer로 자동 바뀐거 (Autoboxing)
		
		Object [] obj = {10,30, "ㅁㅁ", 3.14}; //오토박싱
		
		//원래(과거)
		//int --> Integer
		int xx=10;
		Integer xx2= new Integer(xx);
		
		
		
		

				

	}

}
