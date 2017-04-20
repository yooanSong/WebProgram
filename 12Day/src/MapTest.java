import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		//Map계열: key/value (name/value) 쌍으로 저장
		//저장된 데이터는 key(name)이용해서 value 조회.
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put("one", "홍길동");
		map.put("two", "이순신");
		//map.put("three", 123); //문자열을 써야 하는데 정수를 써서 에러남 
		map.put("two", "이순신22");
		
		//map.remove("two");
		System.out.println(map.get("one")+"\t"+map.get("two")); //키값을 이용해 value를 출력함 
		System.out.println(map.get("xxx")); //null
		System.out.println("=============");

		//key값 얻기
		Set<String> keys= map.keySet();
		for (String key : keys) {
			System.out.println(key+"=" + map.get(key));
		}
		
		System.out.println("=============");
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("xxx", 123);
		
		HashMap<String, ArrayList<Integer>> map3= new HashMap<>();
		
		ArrayList<HashMap<String,String>> kkk= new ArrayList<>();
		HashMap<String, HashMap<String,Integer>> kkk2= new HashMap<>();
		
		
		


	}//end main

}//end class
