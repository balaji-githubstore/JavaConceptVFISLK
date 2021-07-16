package com.vfislk.oops;

abstract class Doctor {
	public String docName;
	
	public Doctor()
	{
		System.out.println("doctor");
	}

	public void address() {
		System.out.println("global hos");
	}

	public void workAt() {
		System.out.println("Hospital - ch");
	}

	public abstract void treatment();
}

class Surgeon extends Doctor
{
	public void treatment() {
		System.out.println("does surgery!!");
		
	}
}


class Dentist extends Doctor {
	public Dentist()
	{
//		super.docName="kkksk";
		System.out.println("dentist");
	}
	public void treatment() {
		System.out.println("treats patient problem related to teeth,tongue!!");
	}
	public void dentistDegree()
	{
		System.out.println("dentist degree");
	}
}

class Veteranian extends Doctor {
	public void treatment() {
		System.out.println("treats animal!!");
	}
	
	
}

public class DocTest {
	
	public static void payroll(Doctor docObj)
	{
		System.out.println(docObj.docName);
	}
	
	public static void main(String[] args) {
		

		

		Doctor d = new Dentist(); //runtimeploymorphism
		d.docName="den";
		System.out.println(d.docName);
		d.treatment();
		d.address();
		d.workAt();
		d.treatment();

//		((Dentist) d).dentistDegree();
		
		
		Doctor v = new Veteranian();
		v.docName="ven";
		System.out.println(v.docName);

		v.address();
		v.workAt();
		v.treatment();
		
		DocTest.payroll(d);
		DocTest.payroll(v);
	}

}
