package com.employee.service;

import org.springframework.stereotype.Service;

import com.employee.bean.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee createEmployee(int empId, String firstName, String lastName) throws Exception {
		String customerId =null;
		if(customerId ==null)  
		{  
		 throw new Exception("Invalid! Customer Id");  
		}  
		Employee emp = new Employee();  
		emp.setId(empId);  
		emp.setFirtsName(firstName);  
		emp.setLastName(lastName);  
		return emp;  
	}

	@Override
	public void deleteEmployee(int empId) {
		System.out.println("Delete" +empId);
	}

}
