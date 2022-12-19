package com.cg.interfaces;
interface In1
{
	int a = 10;
	static void display()
	{
		System.out.println("Static Method");
	}
}
public class Example implements In1{

	public static void main(String[] args) {
		In1.display();

	}

}
