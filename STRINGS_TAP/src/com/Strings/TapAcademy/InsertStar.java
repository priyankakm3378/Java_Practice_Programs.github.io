package com.Strings.TapAcademy;

import java.util.Scanner;

public class InsertStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		System.out.println(Insertion(input));
	}
	
	public static String Insertion(String str) {
		StringBuilder numeric = new StringBuilder();
		StringBuilder alpha = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) 
				{
					numeric.append("*");
					numeric.append(ch);
				}
			else {
					alpha.append(ch);
				}
			}
		alpha.append(numeric);
		return alpha.toString();
		}
	}
