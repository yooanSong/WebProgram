package com.entity;

public class EmpDTO {
   private int empno;
   private String ename;
   private String hiredate;
   private double sal;
   
public EmpDTO(int empno, String ename, String hiredate, double sal) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.hiredate = hiredate;
	this.sal = sal;
}
public EmpDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getHiredate() {
	return hiredate;
}
public void setHiredate(String hiredate) {
	this.hiredate = hiredate;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "EmpDTO [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + "]";
}
   
   
   
   
   
   
   
}
