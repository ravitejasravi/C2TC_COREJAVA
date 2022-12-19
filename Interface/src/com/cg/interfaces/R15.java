package com.cg.interfaces;
interface Bike1
{
	void getMileage();
}
class R16 implements Bike1 {
	public void getMileage()
	{
		System.out.println("Mileage is 40km/L");
	}

}
