package com.Strings.TapAcademy;
import java.util.Scanner;

public class MoveSpecial {
	public static void main(String... args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	scan.close();
	System.out.println(MovingChar(input));
	
	}
	public static String MovingChar(String str) {
		StringBuilder alpha = new StringBuilder();
		StringBuilder special = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(!((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')||
					(ch >= '0' && ch <= '9') ||(ch == ' '))) {
				special.append(ch);
			}
			else {
				alpha.append(ch);
			}
			
		}
		
		alpha.append(special);
		return alpha.toString();
	}
	

}
