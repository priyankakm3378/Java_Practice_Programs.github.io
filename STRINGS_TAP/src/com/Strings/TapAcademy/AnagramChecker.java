package com.Strings.TapAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two strings");
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();

	
	if(anagramCheck(s1,s2)) {
		System.out.println("Anagrams");
	}
	else {
		System.out.println("Not Anagrams");
	}
	sc.close();
	
	}
	public static boolean anagramCheck(String s1, String s2) {
		s1 = s1.replaceAll("\\s","").toLowerCase();
		s2 = s2.replaceAll("\\s", "");
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}

}
