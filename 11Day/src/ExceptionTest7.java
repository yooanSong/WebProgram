import java.io.FileNotFoundException;
import java.io.IOException;

//throws와 관련된 오버라이딩 메소드 

/*접근지정자 : 같거나 크게 주기
리턴타입 : 같거나 작게 주기 
throws예외 클래스 : 같거나 작게 주기 */

class A{
	public void a()throws FileNotFoundException{} 
	//메소드를 같거나 작게 던져야 한다
	// 같은 라인은 아무 상관없음 불가능 ex)EOFException 
	public Object b(){return null;}
	
}
class AA extends A{
	public String b(){return null;} //리턴타입도 같거나 작게 준다  
	//public void a(){} // 더 작은 자식이라서 가능
	//public void a()throws FileNotFoundException{} // 같은 라인에 있으니 가능 
	//public void a()throws IOException{} // 더 큰 라인이라 불가능
}

public class ExceptionTest7 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		System.out.println("프로그램 정상종료");
	}//end main
}
