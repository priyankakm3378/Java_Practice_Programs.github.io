package com.multithreading.tap1;
class  Example implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("JAVA");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}


public class JoinDemo  {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Main thread started.");
	Example e1 = new Example();
	Thread t = new Thread(e1);
	t.start();
	//t.interrupt();
	t.join();
	System.out.println("Main thread is completed its execution.");
}
	
}
