package edu.jspiders.String.Programs;

public class ReverseTwoLetters {

	public static void main(String[] args) {
		String s = "informatic";
		
		for(int i=0; i<s.length();i++) {
			if(i%2!=0) {
				System.out.print(s.charAt(i)+""+s.charAt(i-1));	
		}
		
		}

	}

}
