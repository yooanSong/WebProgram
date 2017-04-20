 
public class IFTest03 {
	public static void main(String[] args){
		//java IFTest3 10
		String str= args[0]; //정수10처럼 보이는 문자열 10이다 숫자로 바꿔야 연산이 가능하다 
		int num= Integer.parseInt(str); // "10"--> 10
		if(num%2 ==0){
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		//조건에 따라 실행되는 것이 다르면 if else문 
		
	}
	
}
