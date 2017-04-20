package selfToken;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "4,2,3,6,7";
		StringTokenizer str2= new StringTokenizer(str, ",");
		while(str2.hasMoreTokens()){
			System.out.println(str2.nextToken());
		}
		//

	}

}
