package com.cg.abstraction;
abstract class Bike1{
	Bike1(){
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda1 extends Bike1{
	void run() {
		System.out.println("running safely");
	}
}
class Demo3 {

	public static void main(String[] args) {
		Honda1 h = new Honda1();
		h.run();
		h.changeGear();

	}

}
