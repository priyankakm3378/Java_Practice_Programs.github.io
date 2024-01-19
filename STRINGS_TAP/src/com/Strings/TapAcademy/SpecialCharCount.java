package com.Strings.TapAcademy;

import java.util.Scanner;

public class SpecialCharCount {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = scan.nextLine();
	int count = 0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(!((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')||(ch==' '))) {
			count++;
		}
		
	}
	System.out.println(count);
	scan.close();
	}

}
