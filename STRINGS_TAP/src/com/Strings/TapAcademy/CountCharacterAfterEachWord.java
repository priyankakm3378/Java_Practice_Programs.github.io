package com.Strings.TapAcademy;

import java.util.Scanner;

public class CountCharacterAfterEachWord {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = scanner.nextLine();
	String[] arr = str.split(" ");
	
	for(int i=0;i<arr.length;i++) {
		
		System.out.print(arr[i]+arr[i].length()+" ");
	}
	scanner.close();
	}

}
