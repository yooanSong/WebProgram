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
		/*this.name = name;
		this.ssn = ssn;
		this.salary = salary;*/ 
		//이 방법 권장하지 않음 왜냐, 부모에서 선언한거니깐 초기화도 부모에서 하자!!  
		
	}
	//오버라이드 메소드가 어떤 메소드가 있는지 알아보는 방법 
	// : 오른쪽-Source-Override/ImplementMethods
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+"\t"+depart;
	}

	/*@Override // 어노테이션(annotation) : 정확하게 이 메소드가 뭔지 알려주고, 그 메소드로만 쓸수 있다  
	public String getEmployee(){
		return super.name+"\t"+ ssn+"\t"+salary+"\t"+depart;
	}*/

}//end class 
