package com.Strings.TapAcademy;
import java.util.Scanner;

public class StarBeforeVowels {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		
		 System.out.println(Insertion(input));
		 
	}
	public static String Insertion(String str) {
		StringBuilder vowels = new StringBuilder();
		
		for(char ch: str.toCharArray()) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				vowels.append("*");
			}
			vowels.append(ch);
		}
		
		return vowels.toString();
	}
}
