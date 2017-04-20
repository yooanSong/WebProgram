package Workshop0201Solution;
import java.util.Scanner;

class HomeWork8 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자  입력하세요");
		int k = scan.nextInt(); //키보드로 정수 입력받기
		if(k%2==0){
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
	}
}
