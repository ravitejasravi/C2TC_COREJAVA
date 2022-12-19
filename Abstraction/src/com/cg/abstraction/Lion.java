package com.cg.abstraction;
abstract class Animal1{
	public abstract void sound();
}
public class Lion extends Animal1
{
	public void sound()
	{
		System.out.println("Roar");
	}
	public static void main(String[] args) {
		Animal1 obj = new Lion();
		obj.sound();

	}

}
