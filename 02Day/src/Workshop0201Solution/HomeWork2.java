package Workshop0201Solution;
import java.util.Scanner;

class HomeWork2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );

		System.out.printf( "1번째 정수입력 : " );
		int num1 = scan.nextInt();
		System.out.printf( "2번째 정수입력 : " );
		int num2 = scan.nextInt();
		System.out.printf( "3번째 정수입력 : " );
		int num3 = scan.nextInt();

		int num12 = ( num1 > num2 ) ? num1 : num2;
		int top = ( num12 > num3 ) ? num12 : num3;

		System.out.printf( num1+", "+num2+", "+num3+","
				+ " 중에서 가장 큰 수는 "+ top );
	}
}
