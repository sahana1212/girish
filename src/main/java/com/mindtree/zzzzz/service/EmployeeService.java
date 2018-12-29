package com.mindtree.zzzzz.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.zzzzz.entity.Employee;



public interface EmployeeService {
	
	public String addEmployee(Employee employee);
	
	public Optional<Employee> getByEmployeeId(int employeeId);
	
	public List<Employee> allEmployees();
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployee(int employeeId);
	
}
