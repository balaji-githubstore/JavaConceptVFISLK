package com.vfislk.variables;

public class VariableDemo {
	public static int aS=10; //static variable or class variable 
	public static int bS=20;
	
	public int aNS=10; //non-static variable or instance variable 
	public int bNS=20;
	
	public static void main(String[] args) {
		
		VariableDemo.aS=200;
	
		System.out.println(VariableDemo.aS);
		
		VariableDemo obj1=new VariableDemo(); //allocate the memory //L1
		System.out.println(obj1);
		
		VariableDemo obj2=new VariableDemo(); //L2
		System.out.println(obj2);
		
		VariableDemo obj3=new VariableDemo(); //L3
		
		obj1.aNS=500;
		obj1.bNS=1000;
		
		System.out.println("-------------------------");
		obj2=obj1; //both obj1,obj2 points to L1
		
		obj2.bNS=2000;
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS);
		
		
	
	}

}
