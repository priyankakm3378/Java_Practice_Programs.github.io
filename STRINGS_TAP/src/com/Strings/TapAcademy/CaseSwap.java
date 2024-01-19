package com.Strings.TapAcademy;

import java.util.Scanner;

public class CaseSwap {



public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
       //System.out.println(caseSwap(str));
	caseSwap(str);
	scan.close();
	}
	public static void caseSwap(String str){
	       StringBuilder t = new StringBuilder();
	       
	       for(int i=0;i<str.length();i++){
	           char c =str.charAt(i);
	           
	          if(Character.isUpperCase(c)){
	                 t.append(Character.toLowerCase(c));
	          }
	          else if(Character.isLowerCase(c)){
	                 t.append(Character.toUpperCase(c));
	          }
	          else{
	                 t.append(c);
	          }
	       }
	       System.out.println(t.toString());
	}
	     

}