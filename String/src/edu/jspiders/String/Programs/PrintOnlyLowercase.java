package edu.jspiders.String.Programs;

public class PrintOnlyLowercase {
	public static void main(String[] args) {
		String s = "dgHBHvhvhGHCjBJHBjhvhVhvhj";
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.println(s.charAt(i));
			}
		}
	}

}
