class Outer3{
	int a = 10;
	private int b=20;
	static int c =40; //static변수 (메서드밖에서쓰는변수)
	public void aaa(){} //메서드
	
	static class Inner3{
		static int x=10;
		public void print(){
			//System.out.println(a);//밖 멤버는 접근 못한다
			//System.out.println(b); 
			System.out.println(c);//밖 static은 접근 가능하니깐
			System.out.println(x);
		}
	}//end Inner3
	
}//end Outer3
public class StaticInnerTest {

	public static void main(String[] args) {
		Outer3.Inner3 i= new Outer3.Inner3();
		i.print();
		//static접근하는거니깐 outer를 생성해서 접근
		//할 필요없다 생성없이 바로 접근! 

	}

}
