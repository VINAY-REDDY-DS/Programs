package edu.jspiders.String.Programs;

public class FirstDigitThenCharacter {
	
public static void main(String[] args) {
		
		String s = "hel589lo VI1254NAYreddy12345678";
		
		String d="", ch="";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isDigit(c)) {
				
				d=d+c;
			}
			if((Character.isUpperCase(c)) || (Character.isLowerCase(c))) {
				ch = ch+c;
			}
		}
		System.out.print(d+ch);
	}

}
