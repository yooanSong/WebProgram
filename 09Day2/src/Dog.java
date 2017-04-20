
public class Dog extends Pet {


	public Dog(String name, int age, String species) {
		super(name, age, species);
		}

	@Override
	public void eat(){
		System.out.println("쩝쩝");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	

}//end class
