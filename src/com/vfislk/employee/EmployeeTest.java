package com.vfislk.employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		
		System.out.println(Employee.companyName);
		Employee.companyName="VFI-SLK";
		
		Employee emp1=new Employee();
		
		Employee emp2=new Employee();
		
		
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSalary=5000;

		
		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=4000;
		
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






