import java.util.Scanner;
//java.util에 Scanner가 있다 
//실행중에 키보드를 입력하면 값을 얻어올 수 있다
public class Scanner_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름입력");	
		String data = scan.nextLine();
		System.out.println(data);
		
		
		System.out.println("나이입력");
		int age = scan.nextInt();
		System.out.println(age);

	}

}
