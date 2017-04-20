class B{
	public void bb(int n ){}
	public void bb2(int ... n){
		for (int i : n) {
			System.out.println(i);
		}
	}
}
public class VariArgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.bb(10);
		b.bb(10,20);

		b.bb2(10);
		b.bb2(10,20);
	}

}
