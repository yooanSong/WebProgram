package Workshop0201Solution;

import java.util.Scanner;

class HomeWork10 {
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {// main에서 int 정수지정이 아닌 char을 이용 문자
											// 지정.
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();// 개행하지 않으면 aababcabcd 이런결과값 가짐.
		}//end for
	}
}
