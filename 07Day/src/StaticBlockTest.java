class AAA{
	{
		System.out.println("aa");
	}//블럭이 있으면 메서드로 인식해서 실행이 된다 
	
}
public class StaticBlockTest {
	//인스턴스 블럭 : 초기화 작업 / 생성해야 출력된다 / new객체생성할때마다 생성된다  
	{
		System.out.println("bb");
	}
	//static 블럭 : 초기화 작업 / 생성안해도 출력된다 / 
		//객체 생선 전 해야하는 게 있을때 여기서 한다 (선처리 작업,기본적으로 설정해야 하는 작업있을때 쓰임) 
	//프로그램 실행할때 단 한번 생성된다 
	static{
		System.out.println("cc");
	}

	public static void main(String[] args) {
		StaticBlockTest s = new StaticBlockTest();

	}

}
