package com.cg.interfaces;
interface Inf1
{
	public void method1();
}
public class Demo implements Inf1
{
	public void method1()
	{
		System.out.println("Method");
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.method1();

	}

}
