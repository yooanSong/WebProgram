import java.util.Date;
import com.google.Person;//import 패키지명.접근할클래스명
public class TestPerson {

	public static void main(String[] args) {
	Person p=new Person(); //같은 패키지 안에 있어야 접근이 가능하다 
	//접근하는 방법이 import이다 
	System.out.println(p.name);
	com.facebook.Person pp=
			new com.facebook.Person();
	System.out.println(pp.name);
	
		
	java.util.Random r = new java.util.Random();  //위에 import안쓰고 클래스쓸때 명시적으로 패키지 줌
	Date d = new Date(); //날짜알려주는 클래스 util 패키지에 있다 

	}

}
