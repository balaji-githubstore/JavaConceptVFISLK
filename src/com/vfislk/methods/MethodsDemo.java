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
	//areaOfTriangle
	public static double areaOfTriangle(int base,int height)
	{
		double area=(base*height)/2;	
		return area;
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
		
		//base =25, height=1
		result= MethodsDemo.areaOfTriangle(25, 1);
		System.out.println(result);
	}

}




