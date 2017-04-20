package Workshop0201Solution;
import java.util.Scanner;

class HomeWork11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("임의의수 입력: ");
		int num=scan.nextInt(), sum=0;
		int i=num;

		while (1<=i){  //{반복수행문장}으로 sum=+i 입력한숫자부터 더함. -1씩 내리면서 1까지 총합을 구하게됨.
			sum+=i;
			i--;
		}

		System.out.println("입력하신 숫자의 총합:"+sum);
	}
}
