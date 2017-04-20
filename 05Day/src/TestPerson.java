
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//홍길동 aa@daum.net 184.4 67.33 남
		//이순신 bb@daum.net 199.4 77.33 남
		//유관순 cc@daum.net 154.4 48.33 여
		Person p = new Person();
		p.setName("홍길동");
		p.setEmail("aa@daum.net");
		p.setTall(184.4);
		p.setWeight(67.33);
		p.setGender("남");
		
		Person p2 = new Person();
		p2.setName("이순신");
		p2.setEmail("bb@daum.net");
		p2.setTall(199.4);
		p2.setWeight(77.33);
		p2.setGender("남");
		
		Person p3 = new Person();
		p2.setName("유관순");
		p2.setEmail("cc@daum.net");
		p2.setTall(154.4);
		p2.setWeight(48.33);
		p2.setGender("여");
		
		String name = p.getName();
		String email = p.getEmail();
		double tall =p.getTall();
		double weight = p.getWeight();
		String gender = p.getGender();

		System.out.println(name);
		System.out.println(email);
		System.out.println(tall);
		System.out.println(weight);
		System.out.println(gender);

		
		

		
	}

}
