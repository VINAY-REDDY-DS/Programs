package edu.jspiders.String.Programs;

public class ConvertToLowercase {
	public static void main(String[] args) {
	
	String s = "HELLO VINAY";
	System.out.println(s);
	
	//to lowercase
	//String res = s.toLowerCase(); 
	
	for(int i=0; i<s.length(); i++) {
		
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				//int ascii = s.charAt(i)+32;
				char uch = (char)(s.charAt(i)+32);
	
				System.out.print(uch);
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	
	//to uppercase
	//String res = convertToUppercase(s);
	
	//another method to convert
	//System.out.println(res);
//	
//	}
	
    //or
//String s = "jsdfkabj";
//
//for(int i=0; i<s.length(); i++) {
//
//	if(s.charAt(i)>='a' && s.charAt(i)<='z') {
//		int ascii = s.charAt(i)-32;
//		char uch = (char)ascii;
//
//		System.out.print(uch);
//	}
//	else {
//		System.out.print(s.charAt(i));
//	}
//}
//	
//	public  static String convertToUppercase( String s) {
//		String res = "";
//		for(int i = 0; i<s.length();i++ ) {
//			char ch = s.charAt(i);
//			
//			if(ch>='A' && ch<='Z') {
//			int asciival = ch + 32;
//			char uch = (char) asciival;
//			res = res+uch;
//			}
//			else 
//			{
//				res = res + ch;
//			}
//		}
//		
//		return res;
	}

}
  
