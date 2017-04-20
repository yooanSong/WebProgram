package com.employee.entity;

import java.util.Date;

public class Employee {
	private int empno;
	private String ename;
	private String hiredate;
	private String loc;
	private int sal;
	private String state;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empno, String ename, String hiredate, String loc, int sal, String state) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.loc = loc;
		this.sal = sal;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", loc=" + loc + ", sal="
				+ sal + ", state=" + state + "]";
	}
	public String getEmployeeNum() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmployeeName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Date getDateOfHire() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getState() {
		// TODO Auto-generated method stub
		return this.state;
	}
	
	

}
