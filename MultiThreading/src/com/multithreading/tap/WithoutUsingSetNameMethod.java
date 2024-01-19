package com.multithreading.tap;

class Thname extends Thread{
	Thname(String name){
		super(name);
	}
	
	public void run() {
		System.out.println("Thread is running");
	}
}


public class WithoutUsingSetNameMethod  {
	
	public static void main(String[] args) {
		Thname t1 = new Thname("Priyanka");
		Thname t2 = new Thname("Mulagund");
		
		System.out.println("Thread - 1 :"+t1.getName());
		System.out.println("Thread - 2 :"+t2.getName());
		
		t1.start();
		t2.start();
	}
	
}
