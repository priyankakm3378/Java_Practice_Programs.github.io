// Palindromic string of length 4
package com.Strings.TapAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class palindromicSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		ArrayList<String> palindromicStrings = new ArrayList<>();
		
		for(int i=0;i<=str.length()-4;i++) {
			String substr = str.substring(i,i+4);
			if(isPalindrome(substr)) {
				palindromicStrings.add(substr);
			}
		}
		
		for(String strr: palindromicStrings) {
			System.out.println(strr);
		}
		
		sc.close();

	}
	
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		left++;
		right--;
		}
		return true; 
		
	}

}
