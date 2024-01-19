package com.Strings.TapAcademy;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	
	String[] words = input.split(" ");
	StringBuilder revstr = new StringBuilder();
	scan.close();
	for(String word : words) {
		StringBuilder rev = new StringBuilder(word).reverse();
		revstr.append(rev).append(" ");
	}
	System.out.println(revstr.toString().trim());
	
}
}
