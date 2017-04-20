//카운트 클래스 객체생성 몇번 했는지 셀려고 한다 ( 카운트는 기본 생성자에서한다)
class Counter{
	private int num; //인스턴스 변수라서 new 할때마다 매번 만들지는 애 즉, 누적할 수 없다 
	private static int count;
	
	public Counter(){ //count가 호출할때마다 센다 
		//num++;
		count++;
	}
	public int getNum(){ //num이란 변수있으니깐 호출하기 위해 getNum이 있는거다 
		return num; 
	}
	
	public int getCount(){ //인스턴스 변수라서 쓰려면 new 객체 생성해야함 
		return count; 
	}
	//static 변수 
	public static int getXXX(){ //static 이라서 객체 생성 안해도 쓸 수 있다, 인스턴스와 상관없다  
		return count;
	}
	
	
	
}//end class  
public class TestCount {

	public static void main(String[] args) {
		//System.out.println(Counter.count);
		System.out.println(Counter.getXXX()); //클래스 이름으로 메소드 접근, 객체생성 안해도됨 
		
		Counter c= new Counter();
		System.out.println(c.getCount());
		Counter c2= new Counter();
		System.out.println(c2.getCount());


	}//end main 

}
