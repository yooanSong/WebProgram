package Workshop0201;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// 8. 임의의 수를 입력받아 짝수인지 홀수인지 출력해 보세요.
		
		int num =0;
		Scanner scan = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 :");
		num= scan.nextInt();
		
		if(num%2==0)System.out.println("이 정수는 짝수 입니다");
		else System.out.println("이 정수는 홀수 입니다");
			

	}

}
