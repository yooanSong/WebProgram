
public class ArryTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 (생성방법5가지)
		//비정방형 -> 열의 크기가 다름 
		int[][]num = new int[3][]; //[행크기][열크기]
		num[0] =new int[3];
		num[1] =new int[1];
		num[2] =new int[2];
		
		//값 설정
		num[0][0] =1;
		
		num[0][1] =2;
		num[0][2] =3;

		num[1][0] =4;
		
		num[2][0] =5;
		num[2][1] =6;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		
		for (int[] is : num) {
			for (int i : is) {
				System.out.println(i);
			}
			
		}
		

	}//end main

}//end class