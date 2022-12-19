package com.cg.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

 class PrgLifeCycle {
	@BeforeAll
	public void display() {
		System.out.println("Before all");
	}
	@AfterAll
	public void display1() {
		System.out.println("after all");
	}
	@AfterEach
	public void display2() {
		System.out.println("after each");
	}
	@Test
	public void display3() {
		System.out.println("Actual Test");
	}

}
