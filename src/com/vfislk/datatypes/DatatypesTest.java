package com.vfislk.datatypes;

public class DatatypesTest {

	public static void main(String[] args) {
		
		byte a=127;  //8 bit
		short b=100; //16bit
		int c=100; //32 bit
		
		c=a; //implicit conversion // no data loss
		
		//percentage //0-100
		//1000 students --> 8*1000 bits of memory / 32*1000 bits of memory
		
		long num=78788787878L; //64 bit
		
		float x=10.2f;  //32 bit
		double y=10.2; //64 bit
		
		double d=1.123456789;
		
		float f=(float) d; //explicit coversion // data loss
		
		System.out.println(d);
		System.out.println(f);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		char letter='j'; //16 bits
		boolean check=true; //1 bit
		
		
		String name="bala"; //4*16 bits 
		
		System.out.println(name);
		System.out.println(name.charAt(1));
		
		System.out.println(name.toUpperCase());
		
	}
}





