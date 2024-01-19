package com.Strings.TapAcademy;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	sc.close();
	PangramCheck(input);
	
	}
	public static void PangramCheck(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		char[] ch = str.toCharArray();
		for(char c:ch) {
			c = Character.toLowerCase(c);
			if(c>='a' && c<='z') {
				set.add(c);
			}
		}
		
		if(set.size() == 26) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not pangram");
		}
		
	}

}
