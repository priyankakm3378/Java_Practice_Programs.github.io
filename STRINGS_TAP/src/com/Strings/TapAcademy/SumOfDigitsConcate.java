package com.Strings.TapAcademy;

import java.util.Scanner;

public class SumOfDigitsConcate {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = scanner.nextLine();
	System.out.println(SumFinder(str));
	scanner.close();

	}
	public static String SumFinder(String str) {
		StringBuilder result = new StringBuilder();
		int sumOfDigits = 0;
		
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				int digit = Character.getNumericValue(c);
				sumOfDigits += digit;
			}
			else {
				result.append(c);
			}
		}
		result.append(sumOfDigits);
		return result.toString();
	}

}
