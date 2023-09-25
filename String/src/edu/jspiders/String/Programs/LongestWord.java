package edu.jspiders.String.Programs;

public class LongestWord {
	
public static void main(String[] args) {
		
		String s = "mom vinayreddy dady";
		
		String w = ""; s+=" "; String lw="";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				if(w.length()>lw.length()) {
					lw=w;
					
					w="";
				}	
			}		
		}
		System.out.println("Longest word = "+ lw);
	}

}
