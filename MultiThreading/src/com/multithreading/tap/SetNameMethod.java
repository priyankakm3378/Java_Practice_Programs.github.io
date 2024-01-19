package com.multithreading.tap;

public class SetNameMethod extends Thread {

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		SetNameMethod t1 = new SetNameMethod();
		SetNameMethod t2 = new SetNameMethod();
		
		System.out.println("Name of t1 :"+t1.getName());
		System.out.println("Name of t2 :"+t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("Priyanka");
		System.out.println("After changing name of t1 :"+t1.getName());
	}
}
