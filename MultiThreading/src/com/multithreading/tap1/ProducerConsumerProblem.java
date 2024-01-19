package com.multithreading.tap1;

class Queue1{
	int x;
	boolean is_data_present = false;
	synchronized void store1(int j) {
		try {
			if(is_data_present == false) {
				x = j;
				System.out.println("Produced "+x);
				is_data_present = true;
				notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	synchronized void retrieve1() {
		try {
			if(is_data_present == true) {
				System.out.println("Consumed "+x);
				is_data_present = false;
				notify();
			}
			else {
				wait();
			}
		}catch(Exception e) {
			e.printStackTrace();   
		}
	}
}

class Producer extends Thread{
	Queue1 a;
	Producer(Queue1 q){
		a = q;
	}
	public void run() {
		int i = 1;
		for(;;) {
			a.store1(i++);
		}
	}
}
class Consumer extends Thread{
	Queue1 b;
	Consumer(Queue1 q){
		b = q;
	}
	public void run() {
		for(;;) {
			b.retrieve1();
		}
	}
}


public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
		
	}

}
