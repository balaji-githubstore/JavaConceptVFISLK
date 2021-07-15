package com.vfislk.employee;

public class Employee {

	private int empId;
	public String empName;
	public double empSalary;
	public static String companyName;

	public Employee(int empId) {
		System.out.println(this);
		this.setEmployeeId(empId);
	}
	
	
	
	private void setEmployeeId(int empId)
	{
		this.empId=empId;
	}

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
	
	public void printEmployeeDetail() {
		System.out.println(this);
		System.out.println(this.empId);
		System.out.println(this.empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
	}

//	public static Employee createEmployeeInstance()
//	{
//		Employee e=new Employee();
//		return e;
//	}

}
