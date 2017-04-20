package self;

public class Engineer2 extends Employee2 {
	
	String name;
	String ssn;
	int salary;
	
	public Engineer2(){
		
	}
	
	public Engineer2(String name, String ssn, int salary){
		super(name, ssn, salary);
	}
	

	public String getEmployee2(){
		return super.getEmployee();
	}
}
