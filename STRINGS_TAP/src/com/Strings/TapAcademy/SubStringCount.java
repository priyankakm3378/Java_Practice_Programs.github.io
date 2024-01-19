package com.Strings.TapAcademy;

import java.util.Scanner;

public class SubStringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(subString_count(str1,str2));
		sc.close();
	}
	
	public static int subString_count(String s1,String s2) {
		int index = 0;
		int count = 0;
		
		while(index != -1) {
			index = s1.indexOf(s2,index);
			if(index != -1) {
				count++;
				index += s2.length();
			}
		}
		
		return count;
		
	}

}
