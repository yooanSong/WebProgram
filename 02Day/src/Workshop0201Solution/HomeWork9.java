package Workshop0201Solution;
import java.util.Scanner;

class HomeWork9 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("면접 점수 입력하세요");
		int a = scan.nextInt(); //키보드로 정수 입력받기
		System.out.println("영어 점수 입력하세요");
		int b = scan.nextInt(); //키보드로 정수 입력받기
		int c = a+b;
		int d = c/2;
		if(d  >=80){
			System.out.println("합격 " );
		}
		else {
			System.out.println("불합격 " );
		}
	}
}
