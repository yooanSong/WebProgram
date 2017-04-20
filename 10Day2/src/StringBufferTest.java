
public class StringBufferTest {

	public static void main(String[] args) {
		//StringBuffer => 별명: 고무줄, 크기변경 가능 
		//1.생성방법 
		StringBuffer s = new StringBuffer();
		s.append("hello"); //버퍼에 문자열을 추가한다 
		System.out.println(s);
		
		StringBuffer s2 = new StringBuffer("hello");
		s.append(s2); //생성할때 hello 값을 넣어주는 경우 
		System.out.println(s2);
		
		System.out.println("======================");
		//2.메서드
		s2.append("world");
		s2.append(123); //버퍼크기 늘어나면서 추가한 경우 
		s2.insert(10, "happy");
		s2.delete(0, 5); 
		System.out.println(s2);
		
		System.out.println("======================");
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println(s.substring(0,2));
		System.out.println(s.charAt(0));
		
		System.out.println("======================");
		//String로 저장
		String kkkk= s.toString(); //스트링 퍼버로 작업한거를 문자열로 바꿔서 저장해야 한다 
		//StringBuffer객체를 String객체로 변경한다 
		






	}

}
