package com.Strings.TapAcademy;

import java.util.Scanner;

public class PrintAllSubStrings {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	sc.close();
	
	char[] ch = input.toCharArray();
	int n = ch.length;
	
	for(int len = 1;len<=n;len++) {
		for(int i=0;i <= n-len ;i++) {
			int j = i + len - 1;
			for(int k=i;k<=j;k++) {
				System.out.print(ch[k]);
			}
			System.out.println();
		}
	}

	}

}
