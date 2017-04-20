package Workshop02Solution;
//6. 세 개의 주사위를 던졌을 때 눈의 곱이 3의 배수인
//값을 출력하는 프로그램 작성하시오
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int inx = 1; inx <= 6; inx++) {
			for (int jnx = 1; jnx <= 6; jnx++) {
				for (int knx = 1; knx <= 6; knx++) {
					if ((inx * jnx * knx) % 3 == 0) {
						System.out.println(inx + "*" 
					+ jnx + "*" + knx + " = " + (inx * 
							jnx * knx));
					} // if
				} // for
			} // for
		} // for
	}

}
/*
1*1*3=3
1*1*6=6
1*2*3=6
1*2*6=12*/