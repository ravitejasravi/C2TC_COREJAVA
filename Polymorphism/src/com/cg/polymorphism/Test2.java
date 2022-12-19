package com.cg.polymorphism;
class Bank{
	int getRateOfInterest() {return 0;}
}
class SBI extends Bank{
	int getRateOfInterest() {return 8;}
}
class ICICI extends Bank{
	int getRateOfInterest() {return 7;}
}
class Axis extends Bank{
	int getRateOfInterest() {return 9;}
}
public class Test2 {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		Axis a = new Axis();
		System.out.println("SBI Rate Of Interest: "+s.getRateOfInterest());
		System.out.println("ICICI Rate Of Interest: "+s.getRateOfInterest());
		System.out.println("Axis Rate Of Interest: "+s.getRateOfInterest());

	}

}
