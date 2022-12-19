package com.cg.exceptionhandling;
import java.util.*;
public class TryCatch {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
			int z=x/y;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Hello World");

	}

}
