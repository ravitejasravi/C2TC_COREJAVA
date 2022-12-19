package com.cg.multithreading;
class Eclipse1 implements Runnable
{
	public void run() {
		System.out.println("Eclipse thread ID is" + " " + Thread.currentThread().getId());
	}
}
class PPT1 implements Runnable{
	public void run() {
		System.out.println("PPT thread ID is" + " " + Thread.currentThread().getId());
	}
}
public class multithread1 {

	public static void main(String[] args) {
		Eclipse1 e = new Eclipse1();
		Thread t = new Thread(e);
		t.start();
		PPT1 p = new PPT1();
		Thread t1 = new Thread(p);
		t1.start();

	}

}
