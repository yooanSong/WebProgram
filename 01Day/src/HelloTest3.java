
public class HelloTest3 {

			public static void main(String[] args) {
				System.out.println("성별:"+'남');
				System.out.println("이름:"+"홍길동");
				System.out.println("체중:"+76.33);
				System.out.println("나이:"+20);
				System.out.println("결혼여부:"+false);
				
				//특별한 포맷지정
				//System.out.printf("포맷",값);
				System.out.printf("성별:%c %s ",'남',"홍길동"); //문자
				System.out.println();
				System.out.printf("이름:%s","홍길동"); //문자열
				System.out.println();
				System.out.printf("체중:%.2f",76.3345768461); //숫자, 정수
				System.out.println();
				System.out.printf("나이:%d",20); //숫자, 실수
				System.out.println();
				System.out.printf("나이:[%-5d]",20); 
				System.out.println();
				System.out.printf("나이:[%05d]",20); 
				System.out.println();
				System.out.printf("결혼여부:%b",false); //boolean
}
}
