package self;
public class DBTest2{
	int deptno;
	String dname;
	String loc;
	
	public DBTest2(int deptno, String dname, String loc){
		this.deptno=deptno;
		this.dname=dname;
		this.loc=loc;
	}
	public DBTest2(){}
	
	public int getDeptno(){
		return deptno;
	}
	public void setDeptno(int deptno){
		this.deptno=deptno;
	}
	public String getDname(){
		return dname;
	}
	public void setDname(String dname){
		this.dname=dname;
	}
	public String getLoc(){
		return loc;
	}
	public void setLoc(String loc){
		this.loc=loc;
	}
	
	
}//end class