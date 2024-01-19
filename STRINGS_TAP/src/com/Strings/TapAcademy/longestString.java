package com.Strings.TapAcademy;

import java.util.Scanner;

public class longestString {
	public static void main(String... args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();
		
		System.out.println(findLongest(input));
	}
	
	public static String findLongest(String str) {
		String longest = "";
		int longlen = 0;
		
		String[] words = str.split(" ");
		
		for(String word : words) {
			if(word.length() > longlen) {
				longest = word;
				longlen = longest.length();
			}
		}
		
		System.out.println(longlen);
		return longest;
		
		
	}
}
