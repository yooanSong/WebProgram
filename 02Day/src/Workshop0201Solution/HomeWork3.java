package Workshop0201Solution;
import java.util.Scanner;

class HomeWork3 
{
	public static void main(String[] args) 
	{
		int time = 0; //시간
		int pay = 0;  //봉급
		double bonus = 1; //시간에 따른 보너스 율
		
		Scanner scan = new Scanner( System.in );

		System.out.println( "보너스 + 봉급 구하기" );
		
		System.out.printf( "근무시간입력 : " );
		time = scan.nextInt();					//근무시간
		
		System.out.printf( "봉급입력 : " );
		pay = scan.nextInt();					//봉급입력

		System.out.println( "====================" );

		if( time < 0 || pay < 0 )
		{
			System.out.println( "봉급과 근무시간은 0미만 일 수 없습니다." );
			//return;//프로그램종료하기
		}

		//보너스 계산
		if( time >= 25 ) bonus = 1;
		else if( time >= 20 ) bonus = 0.8;
		else if( time >= 18 ) bonus = 0.5;
		else bonus = 0;
		System.out.println("보너스 : " + (int)( pay * bonus ) );

		//급여 계산
		System.out.println("지급될 급여 : " + (int)( pay * ( 1 + bonus ) ) );
	}
}
