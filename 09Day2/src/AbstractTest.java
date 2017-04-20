
public class AbstractTest {
	public static void main(String[] args) {
		//Pet p = new Pet(); 추상클래스라서 스스로는 객체생성이 안된다
		
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
