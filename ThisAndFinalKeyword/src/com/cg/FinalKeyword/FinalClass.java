package com.cg.FinalKeyword;

final class FinalClass {
	 void run() {
			System.out.println("running");
	 }
	 class honda extends FinalMethod{
			void run() {
				System.out.println("running safely");
			}
		}

	public static void main(String[] args) {
		honda h=new honda();
		h.run();

	}

}
