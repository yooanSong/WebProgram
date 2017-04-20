class Outer{
	int a = 10;
	private int b=20;
	static int c =40; //static변수 (메서드밖에서쓰는변수)
	public void aaa(){} //메서드
	
	class Inner{
		int x=10;
		//static int y =20; //inner클래스는staic변수 못받는다
		public void print(){
			System.out.println(a);
			System.out.println(b); //b는 private인데 접근 가능!
			System.out.println(c);
			System.out.println(x);
		}
	}
}//end Outer
public class MemberInnerTest {

	public static void main(String[] args) {
		Outer o= new Outer();
		
		Outer.Inner inner= o.new Inner(); 
		inner.print();

	}

}
