package com.multithreading.tap;

class demo1 implements Runnable{
	public void run() {
		System.out.println("Thread is running...");
	}
}
public class UsingRunnable {

	public static void main(String[] args) {
	demo1 d1 = new demo1();
	Thread t1 = new Thread(d1);
	t1.start();

	}
}
