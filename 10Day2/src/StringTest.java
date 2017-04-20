
public class StringTest {

	public static void main(String[] args) {
		//1.String클래스( 별명:철사, 크기변경 안됨, 가공하면 새로운 문자열 생성)
		//가. 생성방법
		String s = "hello"; //literal pool에 저장되고 리터럴로 생성하는 방법 /동일한 문자열이면 참조만 한다 
		
		String s2 = new String("hello"); //heap에 저장되고 / 동일한 문자열이라도 새롭게 생성된다 
		
		//나. 메서드 정리
		int n = s.length();
		System.out.println("문자열길이:"+s.length()); //메모리에 생성한거를 s.하고 길이를 호출한 것 
		int n2= s.indexOf('h');
		System.out.println("특정문자위치(index):"+s.indexOf('h')); //문자열은 배열로 관리한다 위치값 호출한것
		char n3= s.charAt(0);
		System.out.println("index지정된문자얻기:"+s.charAt(0)); 
		String n4 = s.substring(1);
		System.out.println("부분열:"+n4); //1부터니깐 h빼고 나머지 나 출력
		String n5 = s.substring(3,4);
		System.out.println("부분열:"+n5); 
		String n6= s.concat("world");
		System.out.println("문자열 연결:" +n6);
		String n7= s.replace('e', 'x');
		System.out.println("문자 바꾸기:"+ n7); //e를 
		String ss= "AbCdeF";
		String n8 = ss.toUpperCase();
		String n9 = ss.toLowerCase();
		System.out.println("대문자:" +n8);
		System.out.println("소문자:" +n9);
		String sss = "aaa     ";
		String n10 = sss.trim();
		System.out.println("공백제거전:"+sss.length());
		System.out.println("공백제거후:"+sss.trim().length());
		System.out.println("공백제거후:"+n10.length());
		
		String x = "hello";
		String x2= "HeLLo";
		System.out.println(x.equals(x2)); //x와 x2가 같은지 비교(대소문자 가림) 
		System.out.println(x.equalsIgnoreCase(x2)); //대소문자 안가리고 비교
		System.out.println("====================");
		//구분자 이용한 문자열 분리
		String y = "aaa/bbb/ccc";       
		String [] data= y.split("/");       //배열로 관리 split을 써서 구분하기 
		for(String k : data){
			System.out.println(k);
		}
		System.out.println("====================");
		//문자열로 변경
		String a = String.valueOf(10); //10이란 정수를 문자열로 바꿔줌
		String b = String.valueOf(3.14); //"3.14"
		String c = String.valueOf('A'); //"A"
		String d = String.valueOf(true); //"true"
		System.out.println(a+"\t"+a.length());
		
		System.out.println("=====================");
		//특정 포맷
		String kkk = String.format("이름은 %s, 나이는%d", "홍길동",20);
		System.out.println(kkk);
				
		System.out.println("=====================");
		//특정 문자 포함 여부
		System.out.println("특정문자열 포함여부:"+ s.contains("hel")); //포함되서 true s.은 위에 hello를 말함
		
		System.out.println(s); // 같은 hello를 계속 생성했던 경우 
		
		




		



		
		
		
		
		

		
		
		

	}

}
