package com.vfislk.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	
//	public static void printEmployeeDetail(Employee emp)
//	{
//		System.out.println("------------------");
//		System.out.println(emp);
//		System.out.println("Employee id "+emp.empId);
//		System.out.println("Employee name "+emp.empName);
//		System.out.println(emp.empSalary);
//		System.out.println(Employee.companyName);
//		System.out.println("------------------");
//	}
//	
	public void printEmployeeDetail()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
	}
	
	
}
