package com.cg.FinalKeyword;

public class FinalMethod {
	final void run() {
		System.out.println("running");
	}
	class honda extends FinalMethod{
		void run() {
			System.out.println("running safely");
		}
	}

	public static void main(String[] args) {
		honda h=new honda();
		h.clone().run();

	}

}
