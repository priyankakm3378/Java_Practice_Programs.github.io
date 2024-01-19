package com.Strings.TapAcademy;

import java.util.Scanner;

public class RemoveLower{

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String  t = "";
		for(char ch: str.toCharArray()) {
			if(!(ch >= 'a' && ch <= 'z')) {
				t = t + ch;
			}
		}
		System.out.println(t);
	}
}
