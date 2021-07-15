package com.vfislk.methods;

public class Area {
	
	public static double areaOfCircle(int r) {
		double area = 3.14 * r * r;
		return area;
	}

	public static int areaOfRectangle(int length, int width) {
		return length * width;
	}

	//non-static
	public double areaOfTriangle(int base, int height) {
		double area = (base * height) / 2;
		
		return area;
	}
	
	public static void printClassDetail()
	{
		System.out.println("Area related formulae will be here!!");
	}
	
	public String getAuthorName()
	{
		return "Bala";
	}
	
	
	
	
}
