package com.vfislk.areatest;



import java.util.Scanner;

import com.vfislk.methods.Area;



public class AreaTest {

	public static void main(String[] args) {
		
//		Scanner scanner=new 		
		System.out.println(Area.areaOfCircle(25));
		
		Area area=new Area();
		double res = area.areaOfTriangle(25, 1);
		
		System.out.println(res);
		
		
	}

}
