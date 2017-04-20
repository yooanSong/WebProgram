
public class OpTest4 {

	public static void main(String[] args) {
		//1.산술연산자
		int n =10;
		int n2 =3;
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		System.out.println(n/n2);
		int n3= n%n2;
		System.out.println(n3);
		
		//2.대입연산자
		int x=10;
		int x2=x;
		x2 += x;  //x2= x2+ x;
		System.out.println(x2+"\t"+x);
		x2 -= x;
		System.out.println(x2+"\t"+x);
		x2 *= x;  
		System.out.println(x2+"\t"+x);
		x2 /= x;
		System.out.println(x2+"\t"+x);
		x2 %= x; 
		System.out.println(x2+"\t"+x);
		
		//3.비교연산자 -> 실행결과는 논리값 
		int y=10;
		int y2=9;
		System.out.println(y==y2);
		System.out.println(y!=y2);
		System.out.println(y>y2);
		System.out.println(y>=y2);
		System.out.println(y<=y2);
		System.out.println(y<=y2);
		
		//4.증감 연산자 (증가, 감소연산자)
		int p =10;
		++p; //전치
		System.out.println(p);
		int p2 =10;
		p++; //후치
		System.out.println(p2);
		
		//다른 연산자 및 메서드와 같이 사용시 주의하자
		int xx=10;
		int xx2= ++xx;
		System.out.println(xx+"\t"+xx2); 
		
		int yy=10;
		int yy2= yy++;
		System.out.println(yy+"\t"+yy2);
		
		//5.논리 연산자 (&&and, ||or, !not) 
/*		//&& and 연산자 : 하나라도 false면 다 false값 나옴
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); // false 
		 //dead code: short circuit, 앞에가 이미 false니까 뒤에 true는 아에 
		//검증해 보지도 않는다 그래서 60,61번 앞에 느낌표가 뜬거 
		String name = null;
		System.out.println((3<4) && (name.length()!=0) );*/
		//null값인데 메서드 쓴거 그래서 에러가 남 
		
		//|| or 연산자
				System.out.println(true || true); //true
				System.out.println(true || false); //true
				System.out.println(false || true); //true
				System.out.println(false || false); // false 
		//! not 연산자
				System.out.println(!true); //false
				boolean result = false;
				System.out.println(!result); // true 
				
		//6. 3항 연산자
				int xxxx=(3>4)? 100:200; //참이면 앞에값, 거짓이면 뒤에값 출력
				System.out.println(xxxx); //200 
				
		String xxxx2= (3>4)? "헝":"박";
		System.out.println(xxxx2);
		int xxxx3 = (3>4)? 100: ((3>4)? 200:300);
		System.out.println(xxxx3);
	}

}
