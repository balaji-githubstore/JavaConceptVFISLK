package com.vfislk.collections;

public class CheckTest {

	public static void main(String[] args) {

		String name="bala";
		String name1="bala";
		
		String name2=new String("bala");
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name==name1);
		
		System.out.println(name==name2);
		
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		

	}

}
