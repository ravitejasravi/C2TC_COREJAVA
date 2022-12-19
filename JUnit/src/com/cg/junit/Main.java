package com.cg.junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class Ab{


@Test
public void B() {
	System.out.println("hello");

}
@RepeatedTest(10)
public void A() {
	System.out.println("Welcome");
	
}
}

public class Main {

	public static void main(String[] args) {
	
	}

}
