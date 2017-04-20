package Workshop0201;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		/*
		 * 11.임의의 수를 입력받아 입력받은 수까지 합을 구해 보세요. 
		 * While사용 예) 
		 * 임의의 수 입력:50 
		 * [결과]1부터 50까지의 합:XX
		 */
		int num = 0;
		int sum = 0; //더하는 거니깐 초기값1을 주면 +1한 결과값 출력 
		Scanner scan = new Scanner(System.in);
		System.out.printf("임의의 수 입력:");
		num = scan.nextInt();
		
		if(num<=0){System.out.println("0보다 큰수를 입력하세요");}

		for (int i = 0; i <=num; i++) {
				sum += i;			
		}System.out.println("[결과]" + "1부터" + num + "까지의 합:" + sum);

	}// end main

}
