package edu.jspiders.String.Programs;

public class StringPallindrome {

	public static void main(String[] args) {
		String s = "pop";
		String rev = "";
		
		for (int i = s.length()-1; i >=0 ; i--) {
			char ch=s.charAt(i);
			rev = rev + ch;		
		}
	
		if(rev.equals(s)) {
			System.out.println(rev +" is a pallindrom");
		}
		else
		{
			System.out.println(rev +" is not a pallindrom");
		}
	}
}
