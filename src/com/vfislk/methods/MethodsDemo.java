package com.vfislk.methods;

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
		
		//base =25, height=1
		result= Area.areaOfTriangle(25, 1);
		System.out.println(result);
		
		
	}

}




