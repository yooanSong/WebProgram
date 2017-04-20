package Workshop0201;

import java.util.Scanner;

public class Test01 {
	public static void main(String [] args){
		//1.가로, 세로 길이를 입력 받아 사각형의 넓이를 구해보세요
		//단, 가로 또는 세로의 길이가 0 이하면 안됨 
		
		int width=0;
		int height=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형 넓이 구하기");
		System.out.printf("가로: ");//같은줄에 가로 값 넣으려고
		width = scan.nextInt();
		System.out.printf("세로: ");//같은줄에 세로 값 넣으려고
		height = scan.nextInt();
		
		if(width <=0 || height <=0){
			System.out.println("길이는 0이하일 수 없습니다");
			return;
		}
		System.out.println("사각형의 넓이는"+(width*height));
		
		
	}//end main

}
