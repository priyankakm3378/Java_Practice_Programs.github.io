package com.multithreading.tap;

public class UsingSleepMethod {

	public static void main(String[] args) {
		try {
			for(int k=0;k<=5;k++) {
				Thread.sleep(-1000);
				System.out.println(k);
			}
			
		}
		catch(Exception e) {
		e.printStackTrace();
		}

	}

}
