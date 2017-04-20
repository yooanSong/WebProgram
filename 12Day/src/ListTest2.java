import java.util.List;
import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		//List 계열: 순서가 있다. 중복 가능 
		//ArrayList list= new ArrayList();
		List list= new ArrayList();
		list.add("홍길동");
		list.add("이순신");  
		list.add("유관순"); 
		list.add("강감찬");
		
		//1.삽입
		list.add(0,"세종");
		System.out.println(list); //출력은 list.toString 방식으로 
		System.out.println("=============");
		
		//배열변경
		Object []xxx=list.toArray();

		//2.삭제
		list.remove(0); //index 나 값으로 둘다 삭제 가능하다 
		list.remove("유관순");
		System.out.println(list);
		
		System.out.println("=============");
		//3.수정
		list.set(0, "이상해");
		System.out.println(list.size());
		System.out.println(list.contains("이상해"));
		System.out.println("=============");

		//4.전체 삭제
		list.clear();
		System.out.println(list);
		
		
		
	}//end main

}//end class
