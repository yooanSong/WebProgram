 
public class IFTest04 {
	public static void main(String[] args){
		//랜덤값(난수값)구하기
		//1.Math.randon() 메서드
		int d =(int)(Math.random()*10+1);  //범위가 1~10까지 출력된다 
		System.out.println(d);  //출력이 1~10안에서 랜덤으로 출력된다 
		//2.Random 클래스 
		
		System.out.println("===========");
		//3의배수 5의배수 7의배수
		if(d%3==0){
			System.out.println("3의배수");
		}else if(d%5==0){
			System.out.println("5의배수");
		}else if(d%7==0){
			System.out.println("7의배수");

		}
			
	}
	
}
//조건이 여러개의 경우 다중 if문 