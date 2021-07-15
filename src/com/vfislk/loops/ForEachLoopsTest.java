package com.vfislk.loops;

public class ForEachLoopsTest {

	public static void main(String[] args) {
		String[] colors=new String[5]; 
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		double x=Math.PI;
		
		for(String color : colors)
		{
			System.out.println(color);
		}
		
		int[] numbers= {45,89,7,6,8,5};
		
		
		for(int num : numbers)
		{
			System.out.println(num);
		}
	}
}
