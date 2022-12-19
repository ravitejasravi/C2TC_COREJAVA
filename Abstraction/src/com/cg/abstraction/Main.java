package com.cg.abstraction;
abstract class Animal{
	abstract void eat();
}
class Herbivores extends Animal{
	void eat()
	{
		System.out.println("I am a vegetarian");
	}
}
class Carnivores extends Animal{
	
	@Override
	void eat() {
		System.out.println("I am non-vegetarian");
		
	}
}
class Omnivores extends Animal{
	void eat() {
		System.out.println("I will eat both veg and non-veg");
	}
}
public class Main {

	public static void main(String[] args) {
		Animal goat = new Herbivores();
		Animal tiger = new Carnivores();
		Animal bear = new Omnivores();
		goat.eat();
		tiger.eat();
		bear.eat();

	}

}
