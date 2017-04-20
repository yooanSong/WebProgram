package com.employee.biz;

import java.util.ArrayList;

import com.employee.entity.Employee;

public interface IEmployeeBiz {
	ArrayList<Employee> selectAllEmployee();
	ArrayList<Employee> searchList(String inputSubMenu, String searchWord);
//	int createEmplyeeNum();
	String createEmplyeeNum();
	void employeeInsert(Employee emp);
	void employeeUpdate(Employee emp);
	void employeeDelete(int employeeNum);
	void employeeService(int empno, String inputColumn);
	void employeeService(String empno, String inputColumn);

}
