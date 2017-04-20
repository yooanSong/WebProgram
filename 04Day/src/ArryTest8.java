
public class ArryTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 복사 
		int[]num = {1,2,3};
		
		//새로운 배열 생성
		int [] newNUm = new int[6];
		
		System.arraycopy(num, 0, newNUm, 0, num.length);
		newNUm[3]=4;
		newNUm[4]=5;
		newNUm[5]=6;
		for (int i : newNUm) {
			System.out.println(i);
		}
		
		//배열간의 복사 -> System.arraycopy
		//앞에 두개는 어디서부터, 중간2개:어디로, 마지막:몇개를,갯수)
		//num배열의 0번째 인덱스부터 복사하겠다
		//마지막 갯수쓸때 정수를 쓰는게 아니라 그 자체로 가져오기 
		
		

	}//end main

}//end class