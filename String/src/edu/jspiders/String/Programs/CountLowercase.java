package edu.jspiders.String.Programs;

public class CountLowercase {

	public static void main(String[] args) {
		String s = "VinayTDXCHbjhbgYTVHGH";
		int count  =countUpperCase(s);
		System.out.println(count);
		
	}
	
	public static int countUpperCase(String s) {
		int count=0;
		for (int i =0 ; i < s.length()-1 ; i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count++;
				
			}
			
		}
		return count;
		
		}
}
