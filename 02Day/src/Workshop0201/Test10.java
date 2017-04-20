package Workshop0201;

public class Test10 {

	public static void main(String[] args) {
		/*10.for문을 사용해서 아래처럼 출력해 보세요.
		A 65 66 67 68 69
		AB 
		ABC 
		ABCD 
		ABCDE*/
		
		for(char i='A'; i<='E'; i++){
			for(char j='A'; j<=i; j++){
				System.out.print(j); //가로로 나오기 위해 print 썼다는거 유의!  
			}System.out.println();
		}//end for

	}

}
