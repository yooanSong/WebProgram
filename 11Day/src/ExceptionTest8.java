import java.util.Random;

class MyRandomTest{
	public void xxx()throws RandomZeroException{
		Random r = new Random();
		int n= r.nextInt(3); //0,1,2 
		if(n==0){ //사용자가 정의한 예외처리 
			throw new RandomZeroException("0 에러"); //runtime계열이 아니니깐 체크를 함 예외처리 안됬으니 
			//에러가 났던거임 
		}
	}
}
public class ExceptionTest8 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try{
		MyRandomTest x = new MyRandomTest();
		x.xxx();
		}catch(RandomZeroException e){
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상종료");
	}//end main
}
