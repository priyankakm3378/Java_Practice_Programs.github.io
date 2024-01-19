package com.multithreading.tap;

import java.util.Scanner;

class Demo21 implements Runnable{
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

class Demo22 implements Runnable{
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

class Demo23 implements Runnable{
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
public class UsingRunnableInterface {

	public static void main(String[] args) {
		Demo21 d21 = new Demo21();
		Demo22 d22 = new Demo22();
		Demo23 d23 = new Demo23();
		
		Thread t1 = new Thread(d21);
		Thread t2 = new Thread(d22);
		Thread t3 = new Thread(d23);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
