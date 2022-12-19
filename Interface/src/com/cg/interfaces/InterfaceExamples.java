package com.cg.interfaces;
interface Bike2
{
	void getMileage();
}
class R17 implements Bike{
	public void getMileage()
	{
		System.out.println("Mileage is 40km/L");
	}
}
public class InterfaceExamples {

	public static void main(String[] args) {
		R17 bike = new R17();
		bike.getMileage();

	}

}
