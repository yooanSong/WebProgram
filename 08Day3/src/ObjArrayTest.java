import java.util.Date;

public class ObjArrayTest {

	public static void main(String[] args) {
		//다형성 적용예시 
		//1 배열
		Object [] obj={"홍길동",20,3.14,"서울",new Date()}; //import부분 다시 보기 
		
		//instanceof 연산자 ==> 데이터형을 받아와서 변수랑 데이터형이랑 비교하는것  
		//변수명 instanceof 클래스명
		//참조할 수 있으면 true, 못하면 false 
		for(int i =0; i<obj.length; i++){
			Object x= obj[i]; //다형성
			if (x instanceof String){
				System.out.println(x);
			}
			
		}
		
				

	}

}
