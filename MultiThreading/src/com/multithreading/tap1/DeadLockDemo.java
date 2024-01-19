package com.multithreading.tap1;

/*
 * There are two threads AJAY and vijay and there are two resources
TV and Phone. Both the threads now want to acquire both the resources.
AJAY acquires resource2 first which is PlayStation. Vijay acquires resource1 first
which is TV. Now vijay wants phone which is already acquired by AJAY and
AJAY wants Tv which is already acquired by vijay. In this way, they enter into a
state where both the resources are locked and threads enter into deadlock.
*/

/*OUTPUT
AJAY acquired Phone
Vijay acquired Tv
 Cursor keeps blinking as both
 the threads are locked and
 execution never proceeds.
 * */

class Family implements Runnable{
	String resource1 = "TV";
	String resource2 = "Phone";
	
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("AJAY")==true) {
			ajayAcquiredResource();
		}
		else {
			vijayAcquiredResource();
		}
	}
	
	void ajayAcquiredResource() {
		synchronized(resource2) {
			try {
				 System.out.println("Ajay using phone");
				 Thread.sleep(2000);
				 synchronized(resource1){
					 System.out.println("Ajay using TV");
					 Thread.sleep(2000);
				 }
			}catch(Exception e) {
				System.out.println("Ajay failed");
				e.printStackTrace();
			}
		}
	}
	void vijayAcquiredResource(){
		synchronized(resource1) {
			try {
				System.out.println("Vijay acquired TV");
				Thread.sleep(2000);
				synchronized(resource2) {
					System.out.println("Vijay ackuired Phone");
					Thread.sleep(2000);
				}
			}
			catch(Exception e) {
				System.out.println("Vijay failed");
				e.printStackTrace();
				
			}
		}
	}
	
}

public class DeadLockDemo {

	public static void main(String[] args) {
		Family f = new Family();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);
		
		t1.setName("AJAY");
		t2.setName("VIJAY");
		
		t1.start();
		t2.start();
	}

}
