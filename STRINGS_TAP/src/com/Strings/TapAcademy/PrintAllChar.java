package com.Strings.TapAcademy;

import java.util.Scanner;

public class PrintAllChar {

//	public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	String str = scanner.nextLine();
//	
//	for(char c : str.toCharArray()) {
//		System.out.println(c);
//	}
//	
//	scanner.close();
//	}


	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		palindromicString(str);
		subStringMethod(str);
		}
		
	       static	boolean palindromicString(String str){
		       int left = 0;
		       int right = str.length()-1;
		       while(left<right){
		              if(str.charAt(left)==str.charAt(right)){
		              left++;
		              right--;
		              }
		              else{
		                     return false;
		              }
		       }
		        return true;
		}
		static void subStringMethod(String str){
		       boolean b = false;
		       String res="";
		       
	
		      for(int k=str.length()-1;k>=1;k--) {
		    	  if(b) {
		    		  break;
		    	  }
		              for(int i=0;i<=str.length()-k;i++){
		                     res= "";
		                     for(int j=i;j<k+i;j++){
		                            res+= str.charAt(j);
		                     }
		                     
		                     if(palindromicString(res)){
		                            System.out.println(res);
		                            b=true;
		                            break;
		                     }
		              }
		              
		       }
		}
	
}
