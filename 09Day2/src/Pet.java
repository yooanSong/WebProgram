
public abstract class Pet {
	String name;
	int age;
	String species;

	public Pet(String name, int age, String species) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	//추상메서드
	public abstract void eat();
	
	public void sleep(){
	System.out.println("쿨쿨");	
	}
	
	public abstract void cry();
	
	

}
