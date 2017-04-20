//runtime계열인 경우 if로 먼저 물어봐야 한다  
//이 외의 경우는 try catch나 throw로 예외처리 해야한다 
public class ExceptionTest {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
	
		int n=10;
		int x=0; 
		if(x!=0){
			int n2= n/x;
		System.out.println(n2);
		} 
		
		System.out.println("프로그램 정상종료"); // 이문장이 출력되야 정상종료된것 
	}//end main 

}
