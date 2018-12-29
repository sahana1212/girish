package com.mindtree.zzzzz.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.zzzzz.entity.Employee;
import com.mindtree.zzzzz.repository.EmployeeRepository;
import com.mindtree.zzzzz.service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private  EmployeeRepository employeeRepository;
						
	

	@Override
	public String addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Success";
	}

	@Override
	public Optional<Employee> getByEmployeeId(int employeeId) {
		return employeeRepository.findById(employeeId);
	}

	@Override
	public List<Employee> allEmployees() {
		List<Employee> l = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(e-> {l.add(e);});
		return l;
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Success";
	}

	@Override
	public String deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);
		return "Success";
	}
	
	
}
