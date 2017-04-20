package Workshop0201;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// 9. 면접점수와 영어점수를 입력받아 평균이 80이상이면 합격 아니면 불합격을 출력해 보세요.
		
		int interview =0;
		int english=0;
		Scanner scan= new Scanner(System.in);
		System.out.printf("면접점수를 입력하세요 :");
		interview = scan.nextInt();
		System.out.printf("영어점수를 입력하세요 :");
		english = scan.nextInt();
		
		int avg= (interview+english)/2;
		if(avg>=80){
			System.out.println("합격입니다");
		}else{System.out.println("불합격입니다");}
		

	}

}
