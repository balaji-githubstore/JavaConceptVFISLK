package com.vfislk.employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
//		Employee.cr
		
		
		System.out.println(Employee.companyName);
		Employee.companyName="VFI-SLK";
		
//		System.out.println(Employee.getCounter());
		
		Employee emp1=new Employee(101);
		
		Employee emp2=new Employee(102); //102
		
		emp1.empName="John";
		emp1.setEmpSalary(-98);

		
		emp2.empName="Peter";
		emp2.setEmpSalary(9800);
		
//		System.out.println(emp1);
//		Employee.printEmployeeDetail(emp1);
//		
//		System.out.println(emp2);
//		Employee.printEmployeeDetail(emp2);
		
		System.out.println(emp1);
		emp1.printEmployeeDetail();
		
		System.out.println(emp2);
		emp2.printEmployeeDetail();
	}
}






