package com.cg.inheritance;
class Animal3{
	void eat()
	{
		System.out.println("eating..");
	}
}
class Dog3 extends Animal3{
	void bark()
	{
		System.out.println("barking..");
	}
}
class Cat3 extends Animal3{
	void meow()
	{
		System.out.println("meowing..");
	}
}

 class HierarchialInheritance {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.meow();
		c1.eat();
		
		
	}

}
