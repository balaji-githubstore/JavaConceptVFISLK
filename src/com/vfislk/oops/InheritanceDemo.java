package com.vfislk.oops;

class Parent {
	public int pAge;
	
	public Parent(int pAge)
	{
		this.pAge=pAge;
	}

	public void parentStyle() {
		System.out.println("parentStyle");
	}
}


class Child extends  Parent{
	public int cAge;

	public Child(int pAge,int cAge)
	{
		super(pAge);
		this.cAge=cAge;
//		super.pAge=pAge;
		System.out.println(super.pAge);
	}
	
	public void childStyle() {
		System.out.println("childStyle");
	}
}

class GrandChild extends Child
{
	public int gAge;
	public GrandChild(int pAge,int cAge,int gAge)
	{
		super(pAge, cAge);
		this.gAge=gAge;
	}
	public void grandChildStyle() {
		System.out.println("childStyle");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		GrandChild gc=new GrandChild(55, 25, 2);
		gc.parentStyle();
		gc.childStyle();
		gc.grandChildStyle();
		
		

	}

}





//Child c=new Child(55,25);
//System.out.println(c.pAge);
//System.out.println(c.cAge);
//
//c.parentStyle();
//c.childStyle();
