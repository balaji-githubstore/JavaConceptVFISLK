package com.vfislk.datatypes;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] nums= {10,20,55,88};
		System.out.println(nums[5]);
		
		//3 interger
		int[] numbers=new int[3]; //3*32bits		
		numbers[0]=10;
		
		System.out.println(numbers); //address
		
		numbers=new int[5];
		
		System.out.println(numbers); //address
		
		
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[300]);
		
		boolean[] checks=new boolean[2];		//2*1bits
		System.out.println(checks[0]); //
		
		//red,green,yellow
		String[] colors=new String[3]; 
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";

		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		//check on default value of char
		
		
	}

}
