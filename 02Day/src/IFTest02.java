 
public class IFTest02 {
	public static void main(String[] args){
		//eclipse arguments?
		//-> 실행시 특정값을 동적으로 주입하는 방법
		//예) java IFTest2 값 값2
		//주입되는 값들은 문자열(String)로 주입된다 
			 
		//실행할때 내가 원하는 특정값을 클래스명 뒤에다가 붙여주게 되면 
		//값들이 클레스로 들어가게 된다 
		//즉, 실행할때 넣어주는 값들은 배열인 (String[] args) 여기에 들어간다 
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

		
	
		
	}
	
}
