package com.cg.Keywords;

public class This {
	void m()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		This t=new This();
		t.m();
		

	}

}
