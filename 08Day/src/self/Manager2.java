package self;

public class Manager2 extends Employee2 {
	String name;
	String ssn;
	int salary;
	String depart;

	public Manager2() {
		System.out.println("Manager 생성자");
	}

	public Manager2(String name, String ssn, int salary
			,String depart) {
		super(name, ssn, salary);
		this.depart=depart;
		
	}
	public String getEmployee(){
		return super.getEmployee()+"\t"+depart;
	}
	
	
	
	

}//end class
