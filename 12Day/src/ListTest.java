import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		//List 계열: 순서가 있다. 중복 가능 
		ArrayList list= new ArrayList();
		list.add("홍길동");
		list.add(3.14);  
		list.add(20); //데이터 종류를 안가린다
		list.add("홍길동");
		list.add(3.14);  
		list.add(20); //중복된건 출력 안한다 
		
	
		
		//출력방법 
		System.out.println(list);
		//list.toString 
		System.out.println("======================");
		
		System.out.println(list.get(1));
		System.out.println("======================");
		
		for(int i=0; i<list.size(); i++){
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("======================");
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println("======================");
		Iterator ite= list.iterator();
		while(ite.hasNext()){
			Object obj = ite.next();
			System.out.println(obj);
		}

	}//end main

}//end class
