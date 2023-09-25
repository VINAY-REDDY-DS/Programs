package edu.jspiders.String.Programs;

public class PrintStartsAndEndsWith {
	
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
				if(w.startsWith("r"))//w.endsWith(), w.contains(), w.length()==3 or 4.
					System.out.println(w);
					w="";
			}	
		}
	}

}
