
public class ArryTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 (생성방법5가지)
		//정방형 -> 열의 크기가 동일 (정방형은 잘 안쓴다 고정이 되버려서)
		//1. new 이용
		int [][] num = new int[3][2]; //[행크기3개] [열크기2개]
		
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		System.out.println(num[2][0]);
		System.out.println(num[2][0]);
		System.out.println(num[2][1]);

		System.out.println("행길이:"+num.length);
		System.out.println("1행 열길이:"+num[0].length);
		System.out.println("2행 열길이:"+num[1].length);
		
		System.out.println();

		for (int i = 0; i < num.length; i++) {  //행반복
			for (int j = 0; j < num[i].length; j++) { //열반복
				System.out.println(">"+ num[i][j]);
			}
		}
		
		for (int[] is : num) {
			for (int i : is) {
				System.out.println(i);
			}
		}


		

	}//end main

}//end class
