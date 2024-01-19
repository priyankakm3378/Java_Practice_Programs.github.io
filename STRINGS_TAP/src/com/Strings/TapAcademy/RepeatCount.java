package com.Strings.TapAcademy;

import java.util.Scanner;

public class RepeatCount {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str1 = sc.nextLine();
	 String str2 = sc.nextLine();
	 
	 sc.close();
	 int count = 0;
		
	 for(int i=0;(i = str1.indexOf(str2, i)) != -1;i+=str2.length()) {
			count++;
		}
		System.out.println(count);
	}

}
