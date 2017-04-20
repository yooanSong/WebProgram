//throws

class Test{
	public void a() throws ArithmeticException{
		b();
	}
	public void b() throws ArithmeticException{
		int n = 10/0;
	}
}//end Test


public class ExceptionTest5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try{
		Test t = new Test();
		t.a();
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상종료");
	}//end main
}
