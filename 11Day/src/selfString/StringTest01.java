package selfString;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "I am second to none";
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	/*	System.out.println(+"문자개수:"+);
		System.out.println(+"단어개수:"+);*/

	}

}
