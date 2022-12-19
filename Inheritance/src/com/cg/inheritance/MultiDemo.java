package com.cg.inheritance;
class Animal2 {
	void eat()
	{
		System.out.println("eating..");
	}
}
class Dog2 extends Animal2 {
	void bark()
	{
		System.out.println("barking..");
	}
}
class BabyDog extends Dog2{
	void weep()
	{
		System.out.println("weeping..");
	}
}

public class MultiDemo {

	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.weep();

	}

}
