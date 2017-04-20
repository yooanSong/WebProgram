package Workshop01;

public class Test06 {
	public static void main(String [] args){
		byte a =10;
		byte b =20;
		byte c= (byte)(a+b); 
		//int보다 작은 정수끼리 연산하면 데이터형이 int 즉, 
		//명시적으로 byte 해주면 됨 
		//int c= a+b; ->이거아님을 보여주는 예시
		
		char ch='A';
		ch= (char)(ch+2);
		float f = 3/2f;
		long l= 3000*3000*3000L;
		float f2=0.1f;
		double d =0.1;
		boolean result = (float)d==f2;
		
		System.out.println("c="+c); //c=30
		System.out.println("ch="+ch); //ch=C
		System.out.println("f="+f); //f=1.5
		System.out.println("l="+l); //l=27000000000
		System.out.println("result="+result); 
		//result=true
		
				
	}

}
