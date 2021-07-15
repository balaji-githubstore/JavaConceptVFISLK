package com.vfislk.methods;

public class MethodsDemo {
	
	public static double areaOfCircle(int r)
	{
		double area=3.14*r*r;
		return area;
	}
	public static int areaOfRectangle(int length,int width)
	{
		return length*width;
	}
	
	
	public static void main(String[] args) {
		
		int radius = 10; 
		double result= MethodsDemo.areaOfCircle(radius);
		System.out.println(result);

		result= MethodsDemo.areaOfCircle(20);
		System.out.println(result);
		
		System.out.println(MethodsDemo.areaOfCircle(30));
		
		int len=45;
		int wid=45;
		int res=MethodsDemo.areaOfRectangle(len, wid);
		System.out.println(res);
		
	}

}