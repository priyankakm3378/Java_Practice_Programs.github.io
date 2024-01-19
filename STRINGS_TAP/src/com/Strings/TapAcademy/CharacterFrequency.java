package com.Strings.TapAcademy;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = scan.nextLine();
	System.out.println("Enter the character");
	char c = scan.next().charAt(0);
	
	int count = 0;
	
	for(int i=0;i<str.length();i++) {
		if(c == str.charAt(i)) {
			count++;
		}
	}
	System.out.println("The frequency of Character '"+ c +"' is "+count);
	scan.close();
	}

}
