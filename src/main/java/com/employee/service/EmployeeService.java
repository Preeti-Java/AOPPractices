package com.employee.service;

import com.employee.bean.Employee;

public interface EmployeeService {

	Employee createEmployee(int empId, String firstName, String lastName) throws Exception;

	void deleteEmployee(int empId);

}
