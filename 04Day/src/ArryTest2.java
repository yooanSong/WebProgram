
public class ArryTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.배열사용2- LITERAL(값)이용
		//배열선언과 생성분리 안됨
		
		int[] num = {10,20,30};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		//System.out.println(num[4]);
		num[0]=100;
		System.out.println(num[0]);
		System.out.println();

		for (int i=0; i<num.length; i++){
			System.out.println(">" +num[i]);
		}
		for(int i: num){ //for each문의 i는 실제값얻어옴 (자바스크립트는 for in문 첨자값얻어옴) 
			System.out.println("*"+i);
		}
		
		//참조형
		String[] names = {"홍길동","이순신"};
		names[0]="이순신"; //변경가능
		for (int i = 0; i < names.length; i++) {
			System.out.println(">"+names[i]);
		}
		
		for (String str : names) {
			System.out.println(">>"+str);
		}


		

	}//end main

}//end class
