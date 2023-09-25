package edu.jspiders.String.Programs;

public class PrintWordByWord {
	
public static void main(String[] args) {
		
		String s = "SIMPLY vinay reddy";
		System.out.println(s);
		
		for(int i=0; i<s.length(); i++) {
		
		char c = s.charAt(i);
		if(c==' ') {
			System.out.print("\n");
			
		}
		else {
			System.out.print(c);
		}
		
		}
		
		    //or
		
		String w = ""; s+=" ";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				System.out.println(w);
				w="";
			}
			
			
		}
		
	}

}
