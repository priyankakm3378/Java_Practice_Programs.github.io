package com.Strings.TapAcademy;

import java.util.Scanner;

public class StringsPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		scan.close();
		
		for(int len = 1;len<=input.length()-1;len++) {
			for(int i=0;i<=input.length()-len;i++) {
				int j = i + len -1;
				String subs = input.substring(i,j+1);
					if(Palindrome(subs)) {
						System.out.println(subs);
					}
			}
		}
		
	}
	
	public static boolean Palindrome(String input) {
		int left = 0;
		int right = input.length()-1;
		
		while(left < right) {
			if(input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
