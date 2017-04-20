//throws

class Test2{
	public void a() throws ArithmeticException, NullPointerException{ //b의 다중 throws 넘긴것  
		b();
	}
	public void b() throws ArithmeticException, NullPointerException{  //다중 throws가능 
		int n = 10/0;
		
		String name = null;
		System.out.println(name.length());
	}
}//end Test2


public class ExceptionTest6 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try{
		Test2 t2 = new Test2();
		t2.a();
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e){        //main에서도 a의 다중 throws 받아 try catch처리  
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상종료");
	}//end main
}
