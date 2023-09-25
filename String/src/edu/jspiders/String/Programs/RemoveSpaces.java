package edu.jspiders.String.Programs;

public class RemoveSpaces {
	public static void main(String[] args) {
		
		String s = " The hello      vinay";
//		System.out.println(s);
//		
//		String res = s.replace(" ", "");
//		System.out.println(res);
		
		//or
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(!Character.isWhitespace(ch)) {
				System.out.print(ch);
			}
		}
		
		
//		for(int i = 0; i<s.length(); i++) {
//			if(s.charAt(i) == ' ') {
//				System.out.print("");
//			}
//			else {
//				System.out.print(s.charAt(i));
//				}
//			}
	}

}
