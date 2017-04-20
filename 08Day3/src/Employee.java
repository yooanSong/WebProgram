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

	//모든 사원 세금 구하기
	public void taxRate(Employee e){
		if(e instanceof Manager){
			Manager m=(Manager)e;
			System.out.println("Manager 10%");
		}else if(e instanceof Engineer){
			Engineer m=(Engineer)e;
			System.out.println("Engineer 5%");
	}else if(e instanceof Employee){
		Employee m=(Employee)e;
		System.out.println("Employee 3%");
	}
	}//end taxRate
	
	
	
	//블럭을 제외한 메서드형식을 signature라고 한다 
	public String getEmployee(){
		return ssn+"\t"+name+"\t"+salary;
	}

}
