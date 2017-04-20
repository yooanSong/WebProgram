package self;

public class Employee2 {
	String name;
	String ssn;
	int salary;

	public Employee2() {
		System.out.println("Employee2 기본생성자");
	}

	public Employee2(String name, String ssn, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public String getEmployee(){
		return ssn+"\t"+name+"\t"+salary;
	}

}//end class
