package Workshop0201Solution;
import java.util.Scanner;

class HomeWork1 
{
	public static void main(String[] args) 
	{
		int numG = 0; //가로
		int numS = 0; //세로
		Scanner scan = new Scanner( System.in );
		System.out.println( "사각형 넓이 구하기" );		
		System.out.printf( "가로 : " );
		numG = scan.nextInt();					//가로길이		
		System.out.printf( "세로 : " );
		numS = scan.nextInt();					//세로길이
		if( numG <= 0 || numS <= 0 )
		{
			System.out.println( "길이는 0이하일 수 없습니다." );
			return;
		}
		System.out.println("사각형의 넓이는 " + ( numG * numS ) + " 입니다." );
	}
}
