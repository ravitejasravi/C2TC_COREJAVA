package com.cg.lambda;

@FunctionalInterface
interface inter{
	void show();
}

public class LambdaFristEg {

	public static void main(String[] args) {
		inter i=() ->{
			System.out.println("Hello");
			
		};
		i.show();
		
	}
	
}