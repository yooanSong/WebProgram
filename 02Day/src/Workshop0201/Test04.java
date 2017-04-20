package Workshop0201;

public class Test04 {

	public static void main(String[] args){
		//4. for문을 사용해서 1부터100까지 수중 짝수합,홀수합을 구해 보세요.
		int sum = 0;
		int sum2 =0;
		
		for(int i=0; i<101; i+=2){
			sum +=i;
		}
		for(int i=1; i<101; i+=2){
			sum2 +=i;
		}
		
		System.out.println("짝수합 :" + sum);
		System.out.println("홀수합 :" + sum2);

	}//end main

}
