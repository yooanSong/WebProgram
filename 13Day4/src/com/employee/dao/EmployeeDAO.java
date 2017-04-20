package com.employee.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.employee.entity.Employee;

public class EmployeeDAO {
	ArrayList<Employee> selectAllEmployee(Connection con) {
		return null;
	}
	ArrayList<Employee> searchList(Connection con, String inputSubMenu, String searchWord) {
		return null;
	}
	int createEmployeeNum(Connection con) {
		return 0;
	}
	void empoyeeInsert(Connection con, Employee emp) {
	}
	Employee searchEmployee(Connection con, int empno) {
		return null;
	}
	void employeeUpdate(Connection con, Employee emp) {
	}
	void employeeDelete(Connection con, int empno) {
	}
	void employeeService(Connection con, String inputColumn) {
	}
	
	

}
