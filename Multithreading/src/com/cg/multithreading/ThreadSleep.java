package com.cg.multithreading;
class Eclipses extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread ID is" + Thread.currentThread().getId());
			try {
				sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class ThreadSleep {

	public static void main(String[] args) {
		Eclipses c = new Eclipses();
		c.start();

	}

}
