import java.util.Arrays;

class Person{
	String name;
	public Person(String name){
		this.name=name;
	}
	
}//end class 메인메소드 제외 클래스는 public쓰면 안된다 
public class CallByValueTest {
	
	//기본형 데이터변경 메서드
	public static void changeNum(int n){ // 3)이쪽으로 이동해서 n은 10
		n=20;
	} //static 줬기 때문에 객체생성 하지 않고 사용가능하다 
	
	//참조형 데이터변경 메서드
	public static void changePerson(Person p){
		p.name="이순신";
	}

	public static void main(String[] args) { //starting point 
		int aaa =10; // 1)변수만들고 
		changeNum(aaa); // 2)얘기 받아 (기본형)
		System.out.println(aaa);
		
		Person p= new Person("홍길동");
		System.out.println(p.name);
		changePerson(p);  //참조형 
		System.out.println(p.name);
		
		int [] num= {5,24, 53, 2};
		arraySort(num);
		for (int i : num) {
			System.out.println(i);
		}


	}//end main

	public static void arraySort(int [] x){
		Arrays.sort(x);
	}
	
	
}
//기본형 : call by value가 값만 넘겨줬기 때문에 값을 변경해도 안 바뀐다 ,즉 값을 복사해준 형태가 됨 
//참조형 : call by reference 로 인해 데이터가(값) 변경되면 이것도 같이 변경된다, 나도 영향을 받는다 
// 즉, 같은 위치를 참조하는 형태이기때문에 저장했다가 원하는 데이터로 수정 가능하다 !!

//static :프로그램실행과관련됨, 객체생성 안해도 자동으로 생성된다 
//메서드는 객체생성인 new를 해고 ~.해야 메모리에 올라간다 