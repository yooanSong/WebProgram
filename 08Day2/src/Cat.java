
public class Cat extends Pet{	
	String color;
	
	public Cat(String name, int age, String species) {
		super(name, age, species);
		// TODO Auto-generated constructor stub
	}


	public Cat(String name, int age, String species, String color) {
		super(name, age, species);
		this.color = color;
	}

	@Override
	public void eat(){
		System.out.println("호르륵");
	}

	@Override
	public void cry(){
		System.out.println("야옹");
	}

	public void run(){
		System.out.println("살금살금");
	}

	
}//end class 
