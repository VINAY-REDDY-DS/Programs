package edu.jspiders.String.Programs;

public class PrintOnlyFirstCharacterOfWord {
	
public static void main(String[] args) {
		
		String s = "SIMPLY vinay reddy";
		
		System.out.println(s);
		String w = ""; s+=" ";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				System.out.println(w.charAt(0));
				w="";
			}	
		}
	}

}
