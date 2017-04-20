//Manager, engineer의 공통 속성 및 동적을 추출한 부모클래스 
public class Employee {
	String name="emp";
	String ssn; //사원번호 
	int salary; //월급 
	
	public Employee(){
		System.out.println("Employee 기본 생성자");
	}
	
	public Employee(String name, String ssn, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	//블럭을 제외한 메서드형식을 signature라고 한다 
	public String getEmployee(){
		return ssn+"\t"+name+"\t"+salary;
	}

}
