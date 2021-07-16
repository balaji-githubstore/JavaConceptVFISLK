package com.vfislk.student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student.setSchoolName("Global School");
		
		
		Student stu1=new Student(); //1001
		stu1.setName("Balaji");
		stu1.setMailId("bala@gmail.com");
		stu1.setPercentage(55.2);
		
	   
		Student stu2=new Student(); //1002
		stu2.setName("John");
		stu2.setMailId("johnmail.com");
		stu2.setPercentage(55.2);
		
		
		
		int rollNumber=	stu1.getRollNumber();
		System.out.println(rollNumber);
		
		stu2.printStudentDetail();

	}

}
