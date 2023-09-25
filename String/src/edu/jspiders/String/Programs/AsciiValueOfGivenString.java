package edu.jspiders.String.Programs;

public class AsciiValueOfGivenString {
	
public static void main(String[] args) {
		
		String s = "hello";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.println(c+" [ascii value]"+ " - "+(int)c);
			
		}	
	}

}
