package com.cg.interfaces;
interface Bike
{
	void getMileage();
}
class R15 implements Bike
{
	public void getMileage()
	{
		System.out.println("Mileage is 40km/L");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		R15 Bike = new R15();
		Bike.getMileage();

	}

}
