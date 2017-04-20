package workshop02VendingMachine;

import java.util.Scanner;

public class VendingMachine2 {

	public static void main(String[] args) {
		int money=0;
		int i =1;
		Scanner scan= new Scanner(System.in);
		System.out.printf("금액을 입력하세요(종료는 -1):");
		money= scan.nextInt();
		System.out.println("투입금액:"+money+"원");
		System.out.println("잔액:"+money+"원");
		System.out.printf("원하는 음료를 선택하세요"+'\n'+"(1.콜라(700원)2.쥬스(800원)3.생수(500원)):"+i);
		i= scan.nextInt();
		
		if(i==1){System.out.println("1.콜라가 배출되었습니다. 맛있게드세요.");
		return ;
		}


		

	}

}
