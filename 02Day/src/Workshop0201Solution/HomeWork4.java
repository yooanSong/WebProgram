package Workshop0201Solution;
import java.util.Scanner;

class HomeWork4 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i += 2) // 홀수의 합
		{
			sum1 += i;
		}
		for (int i = 0; i <= 100; i += 2) // 홀수의 합
		{
			sum2 += i;
		}

		System.out.println("1부터 100까지 수 중에서");
		System.out.println("홀수의 합은 : " + sum1);
		System.out.println("짝수의 합은 : " + sum2);

	}
}
