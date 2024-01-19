package com.Strings.TapAcademy;

import java.util.Scanner;

public class LastIndexOfChar {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = scan.nextLine();
	System.out.println("Enter the character");
	char c = scan.next().charAt(0);
	
	for(int i=str.length()-1;i>=0;i--) {
		char ch = str.charAt(i);
		if(c==ch) {
			System.out.println(i);
			return;
		}
	}
	scan.close();
	}

}
