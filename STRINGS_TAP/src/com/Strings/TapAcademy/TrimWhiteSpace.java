package com.Strings.TapAcademy;

import java.util.Scanner;

public class TrimWhiteSpace {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	
	System.out.println(str.trim());
	scanner.close();

	}

}
