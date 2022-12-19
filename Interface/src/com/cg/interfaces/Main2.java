package com.cg.interfaces;
interface Interface1
{
	public void myMethod();
}
interface Interface2
{
	public void myMethod();
}
public class Main2 implements Interface1,Interface2
{
	public void myMethod()
	{
		System.out.println("Implementing More than oneInterfaces");
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		obj.myMethod();

	}

}
