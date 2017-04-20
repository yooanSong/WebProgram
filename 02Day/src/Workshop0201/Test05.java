package Workshop0201;

public class Test05 {

	public static void main(String[] args) {
		//5. for문을 사용해서 1부터100까지 수중 출력하세요. 단 한줄에 10개씩 출력한다
		for (int i = 1; i < 101; i++) {
			if (i < 10)System.out.print(" ");
			//1~9까지 공백 한번 더 넣어 줄 맞춰준것 
			System.out.print(i + " "); //println은 엔터효과,print는 쭉 연결출력
			if (i % 10 == 0) {
				System.out.println();
			}
		} // end for

	}

}
