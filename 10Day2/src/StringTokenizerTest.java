import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "aaa/bbb/ccc";

		StringTokenizer st = new StringTokenizer(str, "/");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		System.out.println("---------");
		String str2 = "aaa,bbb,ccc";
		StringTokenizer st2 = new StringTokenizer(str2, ",");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());

		} // hasMoreTokens 더이상 토큰이 없을때까지 돌리는것
		System.out.println("---------");
		String str3 = "aaa/bbb,ccc ddd";
		StringTokenizer st3 = new StringTokenizer(str3, "/, ");   // default는 공백 
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());

		}
	}

}
