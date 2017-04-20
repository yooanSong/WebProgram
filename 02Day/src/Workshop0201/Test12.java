package Workshop0201;

public class Test12 {

	public static void main(String[] args) {
		/*12. 1부터 100까지 수중 3의 배수의 갯수를 출력해 보세요.
		결과:3의배수 갯수:XX개*/
		
		int i=3,count=0;
		
		do{
			i+=3;
			if(i%3==0){
				count++;
			}
		}while(i<=100);
			System.out.println("3의 배수 갯수:"+count);
		
		
		
		
	}//end main

}
/*10까지 
3 6 9 -> 3개 =n
20까지
3 6 9 12 15 18 -> 6개 =2*n 

100까지
10*n



i%2==0 : 2의배수
10까지
2 4 6 8 10 -> 5개
100까지 -> 50개 x/2 */