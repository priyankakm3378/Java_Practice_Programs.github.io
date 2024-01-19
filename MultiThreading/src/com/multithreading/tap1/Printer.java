package com.multithreading.tap1;

class PrintingTask implements Runnable{
	synchronized public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name+" started printing");
		for(int i=0;i<3;i++) {
			System.out.println(name+" is printing");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(name+" completed printing");
		System.out.println("-------------");
	}
}

public class Printer {

	public static void main(String[] args) {
		PrintingTask p = new PrintingTask();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		
		t1.setName("BOY");
		t2.setName("WOMAN");
		t3.setName("MAN");
		
		t1.start();
		t2.start();
		t3.start();
		}

}
