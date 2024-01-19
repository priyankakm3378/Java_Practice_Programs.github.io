package com.Strings.TapAcademy;

import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		isPalindrome(str);
		subStringFinder(str);
		
	}
	
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left)==str.charAt(right)) {
				left++;
				right--;
			}
			else 
			{
				return false;
			}
		}
		return true;
	}
	
	static void subStringFinder(String str) {
		String res = "";
		boolean b = false;
		
		for(int k=str.length();k>=1;k--)
		{
			if(b) {
				break;
			}
		for(int i=0;i<str.length()-k;i++)
		{
			res = "";
			for(int j=i ; j<=k+i ; j++) {
				res+= str.charAt(j);
			}
			
			if(isPalindrome(res)) {
				System.out.println(res);
				b = true;
				break;
			}
		}
		
		}
	}

}
