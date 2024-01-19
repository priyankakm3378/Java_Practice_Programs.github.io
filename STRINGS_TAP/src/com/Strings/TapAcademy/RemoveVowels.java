package com.Strings.TapAcademy;
import java.util.Scanner;

public class RemoveVowels {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String t = "";
		for(char ch: str.toCharArray()) {
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
					|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
				t = t + ch;
			}
		}
	
		
		System.out.print(t);
	}
	
}
