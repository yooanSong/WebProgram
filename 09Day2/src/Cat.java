
public class Cat extends Pet {
	String color;

	public Cat(String name, int age, String species) {
		super(name, age, species);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String species, String color) {
		super(name, age, species);
		this.color = color;
	}

	public void run() {
		System.out.println("살금살금");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("냠냠");

	}

	public void sleep() {
		System.out.println("쿨쿨");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야옹야옹");

	}

}// end class
