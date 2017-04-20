
public class TestFlyer {

	public static void main(String[] args) {
		// Flyer f = new Flyer(); //생성불가 
		
		Flyer b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Flyer a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		((Airplane)a).speed();  //a를 Airplane으로 형 변환한다음 출력 
		
		
		Flyer s= new SuperMan();
		s.takeOff();
		s.fly();
		s.land();
		SuperMan x= (SuperMan)s;
		x.speed();
	

	}

}
