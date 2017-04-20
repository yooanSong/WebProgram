package com.employee.entity;

import java.util.Date;

public class Sales extends Employee{
	
	public static final double COMMISSION_RATE =0.2;
	private double commission;
	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sales(int empno, String ename, String hiredate, String loc, int sal, String state, double commission) {
		super(empno, ename, hiredate, loc, sal, state);
		this.commission = commission;
		// TODO Auto-generated constructor stub
	}
	public Sales(int parseInt, String employeeName, Date date, String location, int parseInt2, String employeeWork,
			double d) {
		// TODO Auto-generated constructor stub
	}

	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	

}
