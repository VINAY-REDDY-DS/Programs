package edu.jspiders.String.Programs;

public class PrintAllSpecialWords {
	
public static void main(String[] args) {
		
		String s = "mom and dad";
		
		
		String w = ""; s+=" ";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				char f = w.charAt(0);
				char l = w.charAt(w.length()-1);
				if(Character.toUpperCase(l)==Character.toLowerCase(f)) {
					System.out.print(w);
					w="";
				}
					
			}	
		}
	}

}
