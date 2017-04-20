package Workshop0201;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*3. 보너스를 지급하려고한다. 근무시간과 봉급을 입력받아
		 근무시간에 따라 보너스를 계산하여 봉급과 합하여 출력하는 
		 프로그램을 작성*/
		int time = 0;
		int pay = 0;
		double bonus = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("보너스 + 봉급구하기");
		System.out.printf("근무시간 입력:");
		time = scan.nextInt();
		System.out.printf("봉급입력:");
		pay = scan.nextInt();
		System.out.println("=========");
		
		if(time <=0 || pay <=0){
			System.out.println("근무시간과 봉급은 0미만일 수 없습니다.");
		}
		
		if(time >=25) bonus = 1;
		else if(time >=20) bonus=0.8;
		else if(time >=18) bonus=0.5;
		else bonus=0;
		System.out.println("보너스:"+(int)(pay*bonus));
		//System.out.println("지급될 급여:"+(int)(pay+(pay*bonus)));
		System.out.println("지급될 급여:"+(int)(pay*(1+bonus)));
		

	}// end main

}
