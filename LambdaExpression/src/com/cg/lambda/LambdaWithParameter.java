package com.cg.lambda;

@FunctionalInterface
interface Bike{
	void run(int i,String s);
	
}

public class LambdaWithParameter {

	public static void main(String[] args) {
		Bike b= (i,s) ->{
			System.out.println("Bike running safely at"+" "+i+"km and driver is"+" "+s);
		};
		b.run(20,"David");

	}

}
