package com.cg.polymorphism;
class Adde{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add1(int a,int b)
	{
		return a+b;
	}
}
public class TestOverloading3 {

	public static void main(String[] args) {
		System.out.println(Adde.add(11, 11));

	}

}
