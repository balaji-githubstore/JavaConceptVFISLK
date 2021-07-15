package com.vfislk.loops;

public class LoopsTest {

	public static void main(String[] args) {

		//1 to 10
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}

		String[] colors=new String[3]; 
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		int size=colors.length;
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(colors[i]);	
		}
		
		
	}
}
