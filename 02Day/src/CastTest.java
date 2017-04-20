
public class CastTest {

	public static void main(String[] args) {
		int n = 10;
		{
			int x = 20;
			System.out.println(x);
			System.out.println(n);
		}
		int x =20;
		System.out.println(x);
		System.out.println(n);
		
		System.out.println("==========");
		//초기값 
		int num=0;
		char c = '\u0000';
		float f = 0.0f;
		double d = 0.0;
		boolean b = false;
		String name = null;//모든 참조변수의 초기값은 null로 설정
		System.out.println(num);
		
				
		System.out.println('a'+1);

	}// end main

}//end class
