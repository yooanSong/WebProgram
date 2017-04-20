package Workshop0201Solution;
import java.util.Scanner;

class HomeWork5 
{
	public static void main(String[] args) 
	{
		int i = 0;
		for ( i = 1 ; i <= 100 ; i++ ) 
		{
			if( i < 10 )System.out.print( " " );
			
			System.out.print( i + " " );
			
			if( i % 10 == 0 )
			{
				System.out.println();
			}//end if
		}//end for
		
	}//end main
}//end class
