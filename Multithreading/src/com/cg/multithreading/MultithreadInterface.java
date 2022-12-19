package com.cg.multithreading;
class Eclipse3 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread ID is" + " " + Thread.currentThread().getId());
		}
	}
}
class PPT3 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("PPT thread ID is " + " " + Thread.currentThread().getId());
		}
	}
}
public class MultithreadInterface {

	public static void main(String[] args) {
		Eclipse3 e = new Eclipse3();
		Thread t = new Thread(e);
		t.start();
		PPT3 p = new PPT3();
		Thread t1 = new Thread(p);
		t1.start();

	}

}
