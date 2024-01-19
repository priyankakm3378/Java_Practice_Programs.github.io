package com.Strings.TapAcademy;

import java.util.Scanner;

public class PrintWordOddEvenIndex {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] words = str.split("\\s+");
		String[] swappedWords = new String[words.length];
		
		for(int i=0;i<words.length;i++) {
			if(i%2==0) {
				int nextIndex = i+1;
				if(nextIndex < words.length) {
					swappedWords[nextIndex] = words[i];
				}
			}
			else {
				int preIndex = i-1;
				if(preIndex >= 0) {
					swappedWords[preIndex] = words[i];
				}
			}
		}
		for(int i=0;i<words.length;i++) {
			if(swappedWords[i] == null) {
				swappedWords[i] = words[i];
			}
		}
		String result = String.join(" ",swappedWords);
		System.out.println(result);
		scan.close();
	}

}
