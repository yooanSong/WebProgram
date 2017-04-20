//Manager is a Employee  
public class Manager extends Employee{
	
	String depart; //관리부서

	//getter,setter
	public Manager(){
		System.out.println("Manager 생성자");
	}
	
	
	public Manager(String name, String ssn, int salary, String depart) {
		super(name, ssn, salary);
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee()+"\t"+depart;
	}


}//end class 
