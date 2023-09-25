package edu.jspiders.String.Programs;

public class ConvertToUpperercase {
	public static void main(String[] args) {
	
	String s = "Hello this is vinay";
	System.out.println(s);
	
	//String res = s.toUpperCase(); another method to convert
	//System.out.println(res);
	
	String res = convertToUppercase(s);
	System.out.println(res);
	
	}
	
	public  static String convertToUppercase( String s) {
		String res = "";
		for(int i = 0; i<s.length();i++ ) {
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z') {
			int asciival = ch - 32;
			char uch = (char) asciival;
			res = res+uch;
			}
			else {
				res = res + ch;
			}
		}
		
		return res;
	}

}
