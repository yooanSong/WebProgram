
public class TestPet2 {

	public static void main(String[] args) {
		
		Pet p = new Cat("야옹이", 10, "코숏");
		p.eat();
		p.sleep();
		p.cry();
		//형변환
		Cat c = (Cat)p;
		c.run(); //원래 타입으로 형변환하는게 에러가 덜난다 
		
		
		p= new Dog("장군", 3, "리트리버");	
		p.eat();
		p.sleep();
		p.cry();


	}

}
