
public class ArryTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 (생성방법5가지)
		//비정방형 -> 열의 크기가 다름 
		//3.new + literal 이용
		int[][]num = new int[][]{{1,2,3},{4},{5,6}}; //행 안에 열이 들어가는 방식 
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}				System.out.println();

		}
		
		
		

	}//end main

}//end class