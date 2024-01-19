package com.multithreading.tap1;

class UserThread extends Thread{
	public void run() {
		System.out.println("user thread started running.");
		for(int i = 0;i<=5;i++) {
			System.out.println("User thread is running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
		System.out.println("User thread finished its execution.");
	}
}

class DaemonThread extends Thread{
	public void run() {
		System.out.println("Daemon thread started execution.");
		for(;;) {
			System.out.println("Daemon thread is executing...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		//System.out.println("Deamon thread completed execution.");
	}
}

public class UserThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread is started executing.");
		UserThread thread = new UserThread();
		thread.start();
		
		DaemonThread d = new DaemonThread();
		d.setDaemon(true);
		d.start();
		System.out.println("Main thread is completed executing.");
		
	}

}
