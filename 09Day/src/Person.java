
public class Person {
	String name;
	int age;
	String address;
	String ssn; //주민번호 
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Person){
			Person s2= (Person)obj;
			if(name.equals(s2.name) && age==s2.age
					&&address.equals(s2.address) && ssn.equals(s2.ssn))
		result=true;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", ssn=" + ssn + "]";
	}
	//





	public Person() {
		super();
	}
	public Person(String name, int age, String address, String ssn) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.ssn = ssn;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	

}
