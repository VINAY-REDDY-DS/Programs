package edu.jspiders.String.Programs;

public class CountWords {
	
public static void main(String[] args) {
		
		String s = "mom 123 dady";
		int count=0;
		for(int i = 0; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(ch==' ')
			System.out.println("");
		else
			count++;
		}
		System.out.println(count);
	}

}
