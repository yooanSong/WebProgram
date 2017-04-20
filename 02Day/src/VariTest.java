
public class VariTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동 20 서울 남 184.56 65.43 결혼여부:true 
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		char gender = '남';
		double height = 184.56;
		double weight = 65.43;
		boolean inMarried = true;
						
		System.out.printf("이름:%s",name); //문자열
		System.out.println();
		System.out.printf("나이:%d",age); //숫자, 실수
		System.out.println();
		System.out.printf("주소:%s",address); //문자열
		System.out.println();
		System.out.printf("성별:%c",gender); //문자
		System.out.println();
		System.out.printf("키:%.2f",height); //숫자, 정수
		System.out.println();
		System.out.printf("체중:%.2f",weight); //숫자, 정수
		System.out.printf("결혼여부:%b \n",inMarried); //boolean
		
		System.out.printf("이름:%s\n나이:%d\n주소:%s",name,age,address); 

	}

}
