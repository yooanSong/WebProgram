//제네릭의 장점 
	//컴파일시 빨리 캐치할 수 있다
	//정해진 타입으로 쓸 수 있으니깐 형변환 안해도 사용가능하다 

import java.util.ArrayList;

class Man{
	String name;
	int age;
	public Man() {
		super();
	}
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class GenericsTest2 {

	public static void main(String[] args) {
		
		ArrayList<Man> list2= new ArrayList<Man>();
		list2.add(new Man("홍길동", 20));
		list2.add(new Man("이순신", 30));
		list2.add(new Man("유관순", 40));
		//list2.add(123);
	
		for (Man man : list2) {
			System.out.println(man.getAge());
		}
		
		ArrayList list= new ArrayList();
		list.add(new Man("홍길동", 20));
		list.add(new Man("이순신", 30));
		list.add(new Man("유관순", 40));
		list.add(123);

		for (Object object : list) {
			Man m= (Man)object; //형변환 시켜줘야 함 
			System.out.println(m.getName());
		}
		//의도하지 않은 값이 들어가도 컴파일 시에 사용할 수 없음 
		
		
	}//end main

}
	









