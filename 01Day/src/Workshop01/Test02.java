package Workshop01;

public class Test02 {
	public static void main (String [] args){
		String s1="1";
		String s2="2";
		boolean bnx= false;
		char c1='A';
		char c2='B';
		char c3='1';
		char c4='2';
		int inx=2;
		
		System.out.println(s1+s2);//12 문자열끼리 연산은 연결
		System.out.println(!bnx);//true
		System.out.println('A'+'B');//131 문자끼리 연산
		System.out.println('1'+inx);//51 문자와 숫자 연산
		System.out.println('1'+'2');//99 문자끼리 연산
	}

}
