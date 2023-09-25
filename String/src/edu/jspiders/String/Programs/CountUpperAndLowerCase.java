package edu.jspiders.String.Programs;

public class CountUpperAndLowerCase {
	
public static void main(String[] args) {
		
		String s = "hello VINAYreddy12345678";
		int count=0, count1=0, count2=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c))
			{
				count++;
			}
			if(Character.isLowerCase(c))
			{
				count1++;
			}
			if(Character.isDigit(c))
			{
				count2++;
			}
		}
		System.out.println(count+" Uppercase");
		System.out.println(count1+" Lowercase");
		System.out.println(count2+" Digit");
	}

}
