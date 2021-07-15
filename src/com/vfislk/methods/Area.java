package com.vfislk.methods;

public class Area {
	
	public static double areaOfCircle(int r) {
		double area = 3.14 * r * r;
		return area;
	}

	public static int areaOfRectangle(int length, int width) {
		return length * width;
	}

	public static double areaOfTriangle(int base, int height) {
		double area = (base * height) / 2;
		return area;
	}
	
	
	
}
