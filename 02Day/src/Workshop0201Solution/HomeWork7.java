package Workshop0201Solution;
import java.util.Scanner;

class HomeWork7 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);


		System.out.println("국어 점수를 입력하세요");
		int k = scan.nextInt(); //키보드로 정수 입력받기
		System.out.println("영어 점수를 입력하세요");
		int e = scan.nextInt(); //키보드로 정수 입력받기
		System.out.println("수학 점수를 입력하세요");
		int s = scan.nextInt(); //키보드로 정수 입력받기

		int sum = k+e+s;
		System.out.println("3과목 총 합은 : " + sum);
		int a = sum/3;
		System.out.println("3과목 평균 : " + a);
	}
}
