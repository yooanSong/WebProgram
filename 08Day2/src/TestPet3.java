
public class TestPet3 {

	public static void main(String[] args) {
		
		Pet [] pets = {new Cat("야옹이", 10, "코숏"),
				new Cat("야옹이2", 4, "코숏"),
				new Cat("야옹이3", 6, "코숏2"),
				new Dog("장군", 3, "리트리버"),
				new Dog("장군2", 4, "리트리버"),
				new Dog("장군3", 8, "리트리버2")		} ;
		
		for(int i =0; i<pets.length; i++){ //for문으로 6번 돌릴거다
			Pet p= pets[i]; //for문 돌린거 다 변수 p에 넣기 
			if (p instanceof Cat){       //그 중에서 조건체크해서 고양이 이냐 
				Cat c = (Cat)p;  //pet에서는 run이 없으니깐 형변환해서 run까지 뽑아내기 
				c.eat(); //출력 방법 ~. 
				c.cry();
				c.sleep();
				c.run();
			}
			
		}
		
		
	}

}
