package Workshop0201Solution;
import java.util.Scanner;

class HomeWork6 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int ans = 1; //초기값
		Scanner scan = new Scanner( System.in );
		System.out.println( "팩토리얼 구하기" );
		System.out.printf( "임의의 정수 입력: " );
		num = scan.nextInt();					
		if( num < 0 )
		{System.out.println( "0 이상 부탁해요" ); return;
		}
		for( int i = 1; i <= num; i++ )
		{
			ans *= i ; 
		}
		System.out.println( num + "!의 값은 " + ans + " 입니다." );
		
	}
}
