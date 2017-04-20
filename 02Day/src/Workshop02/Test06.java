package Workshop02;

public class Test06 {
	public static void main(String[] args) {
		/*
		 * int i = (int)(Math.random()*6)+1; 
		 * int i2 = (int)(Math.random()*6)+1;
		 * int i3 = (int)(Math.random()*6)+1;
		 */

		//3개의 주사위를 계속 던져서 나온 값을 다 곱한게 3의 배수, 그 3의 배수 모두 출력하는 거니깐
		//for문 써서 조건 마지막에 조건주는 게 더 적합하다 
		//Math.random() 이 메소드는 한번만 출력되는 거니깐
		
		
		for (int i = 1; i <= 6; i++) {
			for (int i2 = 1; i2 <= 6; i2++) {
				for (int i3 = 1; i3 <= 6; i3++) {
					if ((i * i2 * i3) % 3 == 0) {
						System.out.println(i + "*" + i2 + "*" + i3 + "=" + (i * i2 * i3));

					}
				}
			}
		}

	}// end main

}
