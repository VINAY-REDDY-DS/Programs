package edu.jspiders.String.Programs;

public class CountRepeatedLetters {
	
public static void main(String[] args) {
		
		String s = "mom 123 dadymm";
		int count=0;
		for(int i = 0; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(ch=='m')
			count++;
		}
		System.out.println(count);
	}

}
