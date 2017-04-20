
public class ArryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.배열사용1 - new이용
		
		//가. 배열선언
		int [] num=null;
		
		//나. 배열생성 및 참조 
		num = new int[3];
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println();
		
		//다. 값 설정
		num[0] =10;
		num[1] =20;
		num[2] =30;
		//num[3] =40;
		
		//데이터출력
		//i를 첨자로 이용할수있으니깐 for문 자주 사용 
		for(int i=0; i<num.length; i++){
			System.out.println("<" +num[i]);
		}
		System.out.println();

		for (int i: num){
			System.out.println("<<<"+i);
		}
		System.out.println();

		//참조형 배열
		String[] names = new String[2];
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		names[0]="홍길동";
		names[1]="이순신";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(">"+names[i]);
		}
		for (String s : names) {
			System.out.println(s);
		}



	}//end main

}//end class
