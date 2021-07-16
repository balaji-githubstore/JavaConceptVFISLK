package com.vfislk.student;

public class Student {
	private int rollNumber;
	

	private String name;
	private String mailId;
	private double percentage;
	private static String schoolName;
	private static int counter=1001;
	
	public Student()
	{
		rollNumber=counter;
		counter++;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals(""))
		{
			System.out.println("Empty record cannot be added");
		}
		else
		{
			this.name = name;
		}
		
	}
	
	public String getMailId() {
		return mailId;
	}
	
	public void setMailId(String mailId) {
		if(mailId.contains("@"))
		{
			this.mailId = mailId;
		}
		else
		{
			System.out.println("mail id is invalid");
		}
		
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		
		if(percentage>0 && percentage<100)
		{
			this.percentage = percentage;
		}
		else
		{
			System.out.println("");
		}
		
	}
	
	
	public static String getSchoolName() {
		return schoolName;
	}
	
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	public void printStudentDetail()
	{
		System.out.println(this.rollNumber);
		System.out.println(this.mailId);
		System.out.println(this.name);
		System.out.println(this.percentage);
		System.out.println(Student.schoolName);
	}
	
	
	

}
