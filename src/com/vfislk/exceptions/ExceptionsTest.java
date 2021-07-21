package com.vfislk.exceptions;

public class ExceptionsTest {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(5000);
			int[] numbers = new int[2];

			numbers[4] = 34; // new ArrayIndexOutOfBoundException()
			int a = 10;
			int b = 0;

			System.out.println(a / b); // new ArithmeticException("");
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
//			throw e;
		}
		finally
		{
			//always run
			System.out.println("code completed!!");
		}
		

	}

}
