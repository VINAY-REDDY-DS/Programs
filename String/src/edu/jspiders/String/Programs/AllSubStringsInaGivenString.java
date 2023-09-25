package edu.jspiders.String.Programs;

public class AllSubStringsInaGivenString {
	
	public static void main(String[] args) {
		
		String s = "hello";
		System.out.println(s);
		String s1 = s.substring(2,4);
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}

	}

}
