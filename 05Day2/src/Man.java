
public class Man {
	private String name;
	private int age;
	//자동으로 기본 생성자가 생성된다 
	/*public Man(){
		System.out.println("Man 생성자");
	}*/
	//오버로딩 메서드 => 재사용 (관리하기 효율적이라서) 
	//오버로딩 생성자
	public Man(String n){
		System.out.println("Man 생성자");
	}
	public Man(String n, int a){
		System.out.println("Man 생성자");
		name = n;
		age=a;
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
