package com.vfislk.employee;

public class Employee {

	private int empId;
	private static int counter=101;
	public String empName;
	
	public static String companyName;
	
	private double empSalary;
	
	private double getEmpSalary() {
		return empSalary;
	}
	
	public void checkPermissionAndReturnSalary(int permissionCode)
	{
		if(permissionCode==1)
		{
			System.out.println(getEmpSalary());
		}
		else
		{
			System.out.println(getEmpSalary());
		}
	}

	public void setEmpSalary(double empSalary) {
		
		if(empSalary>=1000)
		{
			this.empSalary = empSalary;
		}
		else
		{
			System.out.println("Salary Not set");
		}
	}
	
	public Employee()
	{
		
	}

	public Employee(int empId) {
		System.out.println(this);
		
		this.setEmployeeId(empId);
	}
	
	public Employee(int empId,String empName) {
		
	}
	
	public Employee(String empName,int empId) {
		
	}
	
	public Employee(int empId,double salary) {
		
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
		System.out.println(getEmpSalary());
		System.out.println(Employee.companyName);
	}

	
	

	

	public static Employee createEmployeeInstance()
	{
		Employee e=new Employee(45);
		return e;
	}

}
