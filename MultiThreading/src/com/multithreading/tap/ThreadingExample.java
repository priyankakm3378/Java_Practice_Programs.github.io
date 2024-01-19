package com.multithreading.tap;

import java.util.Scanner;


class demo11 extends Thread{
public void run() {
	System.out.println("Addition task is started");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = scan.nextInt();
	System.out.println("Enterr the second number");
	int b = scan.nextInt();
	int c = a+b;
	System.out.println(c);
	System.out.println("Addition task is completed");
	scan.close();
}
}

class demo2 extends Thread{
	public void run() {
		System.out.println("Printing characters task is started");
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing task is completed");
		
	}
}

class demo3 extends Thread{
	public void run() {
		System.out.println("Number printing task is started");
		for(int j=0;j<=10;j++) {
			System.out.println(j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing task is completed");
	}
}
public class ThreadingExample {

	public static void main(String[] args) throws Exception{
		
		demo11 d1 = new demo11();
		demo2 d2 = new demo2();
		demo3 d3 = new demo3();
		
		d1.start();
		d2.start();
		d3.start();

	}

}
