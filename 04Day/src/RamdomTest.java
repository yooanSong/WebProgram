import java.util.Random;

public class RamdomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=(int)(Math.random()* 10+1);  //1~10
		System.out.println(d);
		System.out.println(Math.random()* 10+1);
		
		//2.Random클래스
		Random r = new Random();
		
		int n = r.nextInt(); //0~2의 32승
		int n2= r.nextInt(5); //0~4 
		boolean n3 = r.nextBoolean();
		double n4 = r.nextDouble();
		float n5=r.nextFloat();		
		System.out.println();
		System.out.println(n);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
	}

}
