package Workshop0201;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		/*6. 임의의 수를 입력받아 for문을 사용해서 팩토리얼값을 구해 보세요.
		참고 : 4의 팩토리얼값은 4*3*2*1 이다.
		예)
		정수입력:4
		4!=24*/
		
		int num = 0;
		int ans =1; //0을 주면 연산이 안되니깐 초기값1을 준다
		Scanner scan = new Scanner(System.in);
		System.out.printf("정수입력:");
		num = scan.nextInt();		
		if(num<=0){System.out.println("0보다 크게 입력하세요");}
		for(int i=1; i<=num ;i++){
			ans *= i;
		}
			
		System.out.println(num+"!"+"="+ans);
		

	}

}
