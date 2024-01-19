package com.multithreading.tap;

class demo extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}
}


public class Multi1 {

	public static void main(String[] args) {
	demo d1 = new demo();
	d1.start();

	}

}
