import static java.lang.Math.PI;
import static java.lang.Integer.parseInt;

public class StaticImportTest {

	public static void main(String[] args) {
		System.out.println(Math.PI); //pi 는 상수
		int num= Integer.parseInt("123");
		System.out.println(PI);
		int num2= parseInt("123"); 

	}

}
