package com.employee.controller;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAOP {

	@Before(value="execution(* com.employee.service.EmployeeServiceImpl.* (..)) && args(empId, firstName, lastName)")
	public void beforeCreataEmployee(JoinPoint  joinpoint,int empId, String firstName, String lastName) {
	System.out.println("Adding Employee ");
	}
	
	@After(value="execution(* com.employee.service.EmployeeServiceImpl.* (..)) && args(empId,firstName,lastName)")
	public void afterCreateEmployee(int empId,String firstName,String lastName) {
		System.out.println("Add Employee Successfully");
	}
	
	//Displays all the available methods i.e. the advice will be called for all the methods  
	//For Around Advice
	 // pointcut signature
	@Pointcut(value="execution(* com.employee.service.EmployeeServiceImpl.* (..))")
	public  void logEmployeeService() {
		
	}
	
	
	@Around(value="logEmployeeService() && args(empId,firstName,lastName)")
	public void aroundCreateEmployee(ProceedingJoinPoint pj,int empId,String firstName,String lastName) {
		System.out.println("Starting method of adding EMployee");
		
			try {
				try {
					pj.proceed();
				} catch (Throwable e) {
					e.printStackTrace();
				}
		}
		finally{
			
		}
			System.out.println("Ending method of adding EMployee");
		
	}
	
	//implementing after throwing advice   
	@AfterThrowing(value="execution(* com.employee.service.EmployeeServiceImpl.* (..))",throwing="e")
	public void afterThrowingCreateEmployee(Exception e) {
		System.out.println("Exception is:"+e.getMessage());
	}
}
