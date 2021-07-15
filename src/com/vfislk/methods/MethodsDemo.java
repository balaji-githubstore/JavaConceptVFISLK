package com.vfislk.methods;

import java.io.PrintStream;

public class MethodsDemo {

	public static void main(String[] args) {
		
		int radius = 10; 
		double result= Area.areaOfCircle(radius);
		System.out.println(result);

		result= Area.areaOfCircle(20);
		  System.out.println(result);

		System.out.println(Area.areaOfCircle(30));
		
		int len=45;
		int wid=45;
		int res=Area.areaOfRectangle(len, wid);
		System.out.println(res);
		
		
		Area obj= new Area(); //allocate memory for all non-static fields/methods
		
		//base =25, height=1
		result= obj.areaOfTriangle(25, 1);
		System.out.println(result);
		
		
		Area.printClassDetail();
		
		String name=obj.getAuthorName();
		System.out.println(name);
		
	}

}




