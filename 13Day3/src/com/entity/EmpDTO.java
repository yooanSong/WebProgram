package com.entity;

// dept 테이블에 레코드 값을 저장하는 클래스
// DTO: Data Transfer Object
public class EmpDTO {
  private int deptno;
  private String dname;
  private String loc;
  
  
public EmpDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public EmpDTO(int deptno, String dname, String loc) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	this.loc = loc;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "EmpDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
}
  
}
