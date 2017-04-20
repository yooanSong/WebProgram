package com.employee.biz;

import java.util.ArrayList;

import com.employee.entity.Employee;

public class EmployeeBiz implements IEmployeeBiz {

	public static final String EMPLOYEE_OUT = "외출중";
	public static final String EMPLOYEE_TRIP = "출장중";
	public static final String EMPLOYEE_VACATION = "휴가중";
	public static final String EMPLOYEE_WORK = "근무중";

	@Override
	public ArrayList<Employee> selectAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Employee> searchList(String inputSubMenu, String searchWord) {
		
		
		return null;
	}

	@Override
	public String createEmplyeeNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void employeeInsert(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void employeeUpdate(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void employeeDelete(int employeeNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void employeeService(int empno, String inputColumn) {
		// TODO Auto-generated method stub
		
	}

	public void printSearchList(String inputSubMenu, String searchWord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void employeeService(String empno, String inputColumn) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
