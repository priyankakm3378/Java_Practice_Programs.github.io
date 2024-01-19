package com.Strings.TapAcademy;

import java.util.Scanner;

public class SubstringCheck {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	sc.close();
	System.out.println(subStringCheck(str1,str2)?"Yes":"No");
	}
	
	public static boolean subStringCheck(String str1,String str2) {
		int i = 0;
		int j = 0;
		
		while(i<str1.length() && j<str2.length()) {
			if(str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
			i++;
		}
		return j == str2.length();
	}

}
 
//============================[OR]=================================


//import java.util.Scanner;
//
//public class SubstringCheck {
//
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String mainstr = sc.nextLine();
//	String substr = sc.nextLine();
//	sc.close();
//	System.out.println(subStringCheck(mainstr,substr)?"Yes":"No");
//	}
//	
//	public static boolean subStringCheck(String mainstr,String substr) {
//		return mainstr.contains(substr);
//	}
//
//}


