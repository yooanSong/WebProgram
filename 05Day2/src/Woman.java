//재사용 객체 클래스로 표현할때의 탬플릿 
public class Woman {
	private String name;
	private int age;

	public Woman() {
	}

	public Woman(String name) {
		this.name = name;
	}

	public Woman(String name, int age) {
		this.name = name;
		this.age = age;
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
