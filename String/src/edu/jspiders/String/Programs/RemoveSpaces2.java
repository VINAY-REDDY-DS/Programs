package edu.jspiders.String.Programs;

public class RemoveSpaces2 {
	public static void main(String[] args) {
		
		String s = " The     hello             vinay";
		System.out.println(s);
		
		//s = s.trim();
//		String res = "";
//		for(int i = 0; i<s.length(); i++) {
//			
//			while(s.charAt(i) == ' ' && s.charAt(i+1) == ' ') {
//				i++;
//				
//			}
//			res = res + s.charAt(i);
//		}
		s=s.trim();
		for(int i = 0; i<s.length(); i++) {
		if(s.charAt(i) == ' ' && s.charAt(i+1) == ' ') {
			System.out.print("");
		}
		else {
			System.out.print(s.charAt(i));
			}
		}
	}
}
