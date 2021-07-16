//package com.vfislk.oops;
//
//import javax.print.Doc;
//
//class Doctor {
//	public String docName;
//
//	public void address() {
//		System.out.println("global hos");
//	}
//
//	public void workAt() {
//		System.out.println("Hospital - ch");
//	}
//
//	public void treatment() {
//		System.out.println("treats patient");
//	}
//}
//
//class Dentist extends Doctor {
//	public void treatment() {
//		System.out.println("treats patient problem related to teeth,tongue!!");
//	}
//	public void dentistDegree()
//	{
//		System.out.println("dentist degree");
//	}
//}
//
//class Veteranian extends Doctor {
//	public void treatment() {
//		System.out.println("treats animal!!");
//	}
//	
//	
//}
//
//public class DocTest3 {
//	
//	public static void payroll(Doctor docObj)
//	{
//		System.out.println(docObj.docName);
//	}
//	
//	public static void main(String[] args) {
//
//		Doctor d = new Dentist(); //runtimeploymorphism
//		d.docName="den";
//		System.out.println(d.docName);
//
//		d.address();
//		d.workAt();
//		d.treatment();
//
////		((Dentist) d).dentistDegree();
//		
//		
//		Doctor v = new Veteranian();
//		v.docName="ven";
//		System.out.println(v.docName);
//
//		v.address();
//		v.workAt();
//		v.treatment();
//		
//		DocTest3.payroll(d);
//		DocTest3.payroll(v);
//	}
//
//}
