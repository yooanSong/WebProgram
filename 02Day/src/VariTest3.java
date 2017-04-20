
public class VariTest3 {

	public static void main(String[] args) {
		//형변환(type casting)
		//1. 묵시적(자동)
		
		//a 수치형간의 작은타입 -> 큰타입으로 묵시적 변환
		byte b = 10;
		short b2 = b;
		int b3 =b2;
		long b4 = b3;
		float f = b4;
		double f2 = f;
		
		int x = 'A'; // char -> int 이렇게 하는 이유는 char를 연산하기 위해서 
		
		//b. 작은데이터와 큰 데이터 연산결과는 -> 큰데이터
		int k =10;
		float k2=4.13F;
		float k3 = k + k2;
		//double k3 = k + k2; //
		//10을 3으로 나누는데 소수점까지
		int p = 10;
		int p2= 3;
		float p3 = p / p2;
		System.out.println(p3);
		
		short s = 10;
		short s2=20;
		short s3=(short)(s+s2);
		System.out.println(s3);
		
		int num =10;
		short t =(short)num;
				
		final int NUM= 100; //값 변경 불가
		// NUM = 200;
		System.out.println(NUM);
		
		
		
		
	}

}
