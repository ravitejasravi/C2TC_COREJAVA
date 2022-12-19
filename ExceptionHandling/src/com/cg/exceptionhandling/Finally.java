package com.cg.exceptionhandling;

public class Finally {

	public static void main(String[] args) {
		try{

			int num=300/0;

			System.out.println(num);

			}

			catch(ArithmeticException e){

			System.out.println("Number should not be divided by zero");

			}

			finally{

			System.out.println("This is finally block");

			}

			System.out.println("Out of try-catch-finally");

			

	}

}
