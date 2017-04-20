
public class DataTpye3 {
	//10진수 -> 8진수, 16진수로 변환 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10진수"+100); 
		System.out.println("2진수"+Integer.toBinaryString(100)); 
		System.out.println("8진수"+ Integer.toOctalString(100)); 
		System.out.println("16진수"+ Integer.toHexString(100)); 
		//2. 2진수, 8진수, 16진수 -> 10진수로 변환
		System.out.println("==========================");
		int a = Integer.parseInt(Integer.toBinaryString(100),2);
		int a2 = Integer.parseInt(Integer.toOctalString(100),8);
		int a3 = Integer.parseInt(Integer.toHexString(100),16);
		System.out.println(a+"\t"+a2+"\t"+a3);
		System.out.println("==========================");

		long sss = 1234567891234L; 
		System.out.print(sss);
		System.out.println();
		long sss2 = 10_000_000;
		System.out.print(sss2);

		//long
	}

}
