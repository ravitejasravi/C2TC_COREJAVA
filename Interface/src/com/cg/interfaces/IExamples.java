package com.cg.interfaces;
interface Vehicle{
	void Engine();
}
interface Bile extends Vehicle{
	void getMileage();
}
class R10 implements Bike{
	public void Engine() {
		System.out.println("Liquid-cooled SOHC 4-valve fuel-injected engine");
	}
	public void getMileage() {
		System.out.println("Mileage is 40km/L");
	}
}
public class IExamples {

	public static void main(String[] args) {
		R10 bike = new R10();
		bike.getMileage();
		bike.Engine();

	}

}
