package com.Strings.TapAcademy;
import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String wordToReplace = scan.next();
		String changeWord = scan.next();
		scan.close();
		
		System.out.println(Replace(sentence,wordToReplace,changeWord));
	}
	public static String Replace(String sentence, 
			String wordToReplace, String changeWord) {
		StringBuilder result = new StringBuilder();
		String[] words = sentence.split(" ");
		
		for(String word : words) {
			if(word.equals(wordToReplace)) {
				result.append(changeWord).append(" ");
			}
			else {
				result.append(word).append(" ");
			}
		}
		
		return result.toString().trim();
	}
	
}
