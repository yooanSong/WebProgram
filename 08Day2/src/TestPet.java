
public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("야옹이", 10, "코숏");
		Dog d = new Dog("장군", 3, "리트리버");
		
		c.eat();
		c.sleep();
		c.cry();
		System.out.println("------------");
		d.eat();
		d.sleep();
		d.cry();


	}

}
