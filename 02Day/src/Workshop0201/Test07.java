package Workshop0201;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 7. 국어,영어,수학점수를 입력받아 총점과 평균을 구해 보세요
		int korean =0;
		int english=0;
		int math=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.printf("국어점수 입력:");
		korean = scan.nextInt();
		System.out.printf("영어점수 입력:");
		english = scan.nextInt();
		System.out.printf("수학점수 입력:");
		math = scan.nextInt();
		
		int sum= korean+english+math;
		System.out.println("총점은 :"+(sum));
		System.out.println("평균은 :"+(sum/3));
		
		
		
		

	}

}
