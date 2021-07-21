package com.vfislk.collections;

import java.util.ArrayList;
import java.util.List;

import com.vfislk.employee.Employee;

public class CollectionsTest {

	public static void main(String[] args) {
		
		
		int a=10;
		String b="hello";
		
		Object z= a; //boxing
		z=b; //boxing
		
		String res =  (String) z; //unboxing
		System.out.println(res);
		
		Object x=new Employee(101);
		
		Employee e=(Employee) x;
		
		//non generic type
		ArrayList lists=new ArrayList();		
		lists.add(10);
		lists.add("bala");
		lists.add(45.5);
		lists.add(z);
		
		
		//generic type
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		
		//hashmap
		ArrayList<String>  colors=new ArrayList<>();
		
		colors.add("red");
		colors.add("yellow");
		colors.add("green");
	
		System.out.println(colors.size());
		
		String color1=colors.get(0);
		
		System.out.println(color1);
		
		
		for(String color : colors)
		{
			System.out.println(color);
		}

	}

}
