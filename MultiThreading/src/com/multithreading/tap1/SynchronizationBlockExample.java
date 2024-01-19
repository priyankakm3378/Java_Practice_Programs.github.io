package com.multithreading.tap1;

public class SynchronizationBlockExample {

	public static void main(String[] args) {
		SynchronizationTask task = new SynchronizationTask();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.setName("ONE");
		t2.setName("TWO");
		
		t1.start();
		t2.start();
	}
	
}
	class SynchronizationTask implements Runnable{
		public void run() {
			Thread t = Thread.currentThread();
			String name = t.getName();
			
			try {
				System.out.println(name +" is executing 1st line");
				Thread.sleep(2000);
				System.out.println(name +" is executing 2nd line");
				Thread.sleep(2000);
				System.out.println(name +" is executing 3rd line");
				Thread.sleep(2000);
				
				synchronized(this){
					System.out.println("====================");
					System.out.println(name +" is executing 4th line");
					Thread.sleep(2000);
					System.out.println(name +" is executing 5th line");
					Thread.sleep(2000);
					System.out.println(name +" is executing 6th line");
					Thread.sleep(2000);
					System.out.println("====================");
				}
				
				System.out.println(name +" is executing 7th line");
				Thread.sleep(2000);
				System.out.println(name +" is executing 8th line");
				Thread.sleep(2000);
				System.out.println(name +" is executing 9th line");
				Thread.sleep(2000);
				System.out.println(name +" is executing 10th line");
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}


