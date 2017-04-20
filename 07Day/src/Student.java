
public class Student {
	private String name;
	private int age;
	private String address;
	public Student() {} //인자없는 생성자는 항상 만든다 , 생성자는 초기화 하기 위함 
	
	public Student(String name, int age, String address) { //인자 3개짜리 생성자 
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Student(String name, int age) { //인자 2개짜리 생성자 
		/*this.name = name;
		this.age = age;*/
		
		this(name,age,null); //인자 3개짜리 생성자를 호출해라 (위에껄로 넘어가는 것) 
	}
	
	public Student(String name) { //인자 1개짜리 생성자 
		//this.name = name;
		this(name,0,null); 
	}
	
	
	/*생성자 간에 호출하는 방법이 this다 
	
	예시 
	인자 2개짜리 예시 : 서울에 사는 학생들은 대부분 주소가 서울일것이다 인자 3개짜리를 생성하면 매번 이름, 나이, 주소를 
	입력해야 하는데 인자2개짜리는 주소 값이 고정되었기 때문에 매번 서울을 입력하지 않아도 된다 
	인자 1개짜리 예시 : 이름만 알고 나이 주소는 몰라 그럼 인자 3번째로 생성하면 매번 0, null을 입력해야 하니깐 인자 1개짜리로 
	
	특징 : 반드시 첫라인에 써야 한다  
	
	this 쓰는 용도 
	1 인스턴스 변수, 로컬변수 이름 동일할때 사용한다 
	2 내안에 있는 생성자에서 overloading 생성자를 호출할때 */
	
	
	
	
	

}
