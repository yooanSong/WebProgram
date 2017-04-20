import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//set 계열: 순서가 없다. 중복 안됨
		//HashSet set= new HashSet();
		Set set= new HashSet();
		set.add("홍길동");
		set.add(3.14);  
		set.add(20); //데이터 종류를 안가린다
		set.add("홍길동");
		set.add(3.14);  
		set.add(20); //중복된건 출력 안한다 
		
		//출력방법 
		System.out.println(set);
		//참조변수를 출력하려면 문자열로 출력해야 되서 자동으로 toString으로 
		//데이터 종류 안가리니깐 object로 받으면 된다 (다형성) 
		
		for (Object object : set) {
			System.out.println(object.toString()); 		//데이터 종류 안가리니깐 object로 받으면 된다 (다형성) 

		}// toString은 실제 값을 호출 -> 동적바인딩 일어남 
		//동적바인딩 : 컴파일 할때 인식할때 메소드와, 런타임때 인식하는 메소드가 다르다 실행하는 메소드가
		//런타임 즉 실행중에 결정한다는 것이 동적바인딩  
		
		Iterator ite= set.iterator();//메소드를 통해서 호출하는 방식, new안씀		//데이터 종류 안가리니깐 object로 받으면 된다 (다형성) 
 
		while(ite.hasNext()){
			Object obj = ite.next();
			System.out.println(obj);
		}

	}//end main

}//end class
