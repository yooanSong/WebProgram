import java.util.Arrays;

public class ArryTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays 클래스 -> 배열관련 유틸리티 클래스 
		//1.배열 채우기
		String[] n = {"AAA", "BBB", "CCC", "DDD"};	
		Arrays.fill(n, "111");		
		for (String s : n) {
			System.out.println(s);
		}
		System.out.println();
		//일부분(fromIndex(포함되고) ~ toIndex(포함안된다))
		Arrays.fill(n, 0, 2, "222"); //n이란 얘를 채우겠다 0번째부터 2개를 n은 "222"
		for (String s : n) {
			System.out.println(s);
		}
		System.out.println();
		//2.배열값 비교
		int [] x= {1,2,3};
		int [] x2= {1,2,3};		
		System.out.println(Arrays.equals(x, x2));
		System.out.println();

		//3.정렬(오름차순)
		int [] a={3,5,11,4,99,1};
		Arrays.sort(a);
		for (int s : a) {
			System.out.println(s);		
		}
		System.out.println();

		//4. 특정값의 index값
		int idx = Arrays.binarySearch(a, 11);
		System.out.println(idx);
		System.out.println();
		//5.배열복사
		int[] b={5,4,3,2,1};
		
		int[] b2=Arrays.copyOf(b, b.length);
		for (int s : b2) {
			System.out.println(s);
		}
		System.out.println();
		//6.일부분 복사
		int[] b3=Arrays.copyOfRange(b, 0, 4);
		for (int s : b3) {
			System.out.println(s);
		}

		

	}//end main

}//end class