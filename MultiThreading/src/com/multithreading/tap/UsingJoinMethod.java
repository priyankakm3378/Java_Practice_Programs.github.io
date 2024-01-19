package com.multithreading.tap;

public class UsingJoinMethod extends Thread{

	public void run() {
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		for(int j=65;j<=70;j++) {
			System.out.print((char)(j));
		}
	}
	
	public static void main(String[] args) {
		UsingJoinMethod u1 = new UsingJoinMethod();
		UsingJoinMethod u2 = new UsingJoinMethod();
		
		u1.start();
		
		try {
			u1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		u2.start();
		
	}
}
