package Workshop0201;

import java.util.Scanner;

public class Test02 {
	public static void main(String [] args){
		//2. 세 정수를 입력받아 세 수중 가장 큰값을 구해 보세요.
		
		/*int a;
		int b;
		int c;
		Scanner scan= new Scanner(System.in);		
		System.out.println("숫자 3개를 입력하세요");
		System.out.printf("1번째 정수 입력:");
		a= scan.nextInt();
		System.out.printf("2번째 정수 입력:");
		b= scan.nextInt();
		System.out.printf("3번째 정수 입력:");
		c= scan.nextInt();
		
		if((a > b) && (a>c)){
			System.out.println(a);
			return;
		}else if((b >c) && (b>a)){
			System.out.println(b);
			return;
		}else{
			System.out.println(c);
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("1번째 정수 입력");
		int a = scan.nextInt();
		System.out.printf("2번째 정수 입력");
		int b = scan.nextInt();
		System.out.printf("3번째 정수 입력");
		int c= scan.nextInt();
		
		int d = (a > b ) ? a : b;
		int e = (c > d) ? c : d;
		
		System.out.println(a+","+b+","+c+"중에서 가장 큰 정수는 :"+e);
		
		
		
		
		
	}//end main

}
