package edu.jspiders.String.Programs;

public class PrintOnlyUppercase {
	public static void main(String[] args) {
		String s = "dgHBHvhvhGHCjBJHBjhvhVhvhj";
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				System.out.println(s.charAt(i));
			}
		}
	}

}
