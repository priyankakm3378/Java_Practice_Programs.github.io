package com.Strings.TapAcademy;

import java.util.Scanner;

public class SmallestString {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String str1 = scan.nextLine();
	String[] ar = str1.split(" ");
	scan.close();
	String minStr = null;
	int min = Integer.MAX_VALUE;
	
	for(int i=0;i<ar.length;i++) {
		if(ar[i].length()<min) {
			min = ar[i].length();
			minStr = ar[i];
		}
	}
	System.out.println(minStr);
	}
	
}
