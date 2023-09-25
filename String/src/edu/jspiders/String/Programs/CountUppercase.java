package edu.jspiders.String.Programs;

public class CountUppercase {

	public static void main(String[] args) {
		String s = "VinayTDXCHbjhbgYTVHGH";
		int count  =countUpperCase(s);
		System.out.println(count);
		
		
	}
	
	public static int countUpperCase(String s) {
		int count=0;
		for (int i =0 ; i < s.length() ; i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count++;	
				
			}
			
		}
		return count;
		}
}
