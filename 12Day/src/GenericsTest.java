/*제너릭스(generics)
-자료형(타입)에 얽매이지 않고 프로그래밍 가능 
-자료형을(타입을) 제한할 수도 있다 

=> 일반적으로 제한하는 용도로 (이것만 저장하고 싶어) 많이 쓰인다 
표현식 : <클래식>만 가능
	<int> => <Integer>
*/
// 다형성을 저장할때는 Object쓰면 좋은데, 문제는 원래 타입으로 비교할때 형변환하고 instanceof
//쓰고 다시 object로 형변환 해줘야 함 -> 번거롭다 -> 제너릭스 사용!  

class Test<T>{ //<T>의미는 type
	T s;
	//Object s;
	public void set(T s){ 
		this.s=s;
	}
}//end Test

/*class Test{
	Object s;
	public void set(Object s){ 
		this.s=s;
	}
}//end Test
*/
public class GenericsTest {

	public static void main(String[] args) {
		
		Test<String> t = new Test<String>();
		t.set("hello");
		//t.set(123);
		
		Test<Integer> t2 = new Test<Integer>();
		t2.set(123);
		t.set("hello");

	}//end main

}




















