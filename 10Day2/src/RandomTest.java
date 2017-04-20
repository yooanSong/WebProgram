import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임의의 값 (난수값)
		Random r = new Random();
		int n = r.nextInt();
		int n2 = r.nextInt(10); //0~9까지
		boolean n3= r.nextBoolean();
		float n4= r.nextFloat();
		double n5= r.nextDouble();
		System.out.println(n);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);

		

				

	}

}
