package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.bean.Employee;
import com.employee.service.EmployeeService;

@RestController 
public class EmployeeCmd {
	
	@Autowired
	 EmployeeService employeeService;  
	
	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)  
	public Employee addEmployee(@RequestParam("empId") int empId, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) throws Exception   
	{  
	return employeeService.createEmployee(empId, firstName, lastName);  
	}  
	
	@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)  
	public String removeEmployee( @RequestParam("empId") int empId)   
	{  
	employeeService.deleteEmployee(empId);  
	return "Employee removed";  
	}  

}
