package com.Strings.TapAcademy;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		String input = scan.nextLine();
		String t = "";
		scan.close();
			for(int i=0;i<input.length();i++) {
				char ch = input.charAt(i);
				set.add(ch);
			}
			for(char c : set) {
				t = t + c;
			}
			
		System.out.println(t);
	}

}
