package edu.jspiders.String.Programs;

public class FirstLetterToUpperCase {

	public static void main(String[] args) {
		String s = " i love india"; 
		System.out.println(s);
		String res = "";
		for(int i = 0; i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z' || ch==' ') {
				if(i == 0)
				{
					char uch = (char) (ch - 32);
					res = res + uch;
				}
				else if(ch == ' ')
				{
					char nextChar = s.charAt(i+1);
					char uch = (char) (ch - 32);
					res = res+' ';
					res = res + uch;
					i++;
				}
				else {
					res = res +ch;
				}
				
			}
			else {
				res = res + ch;
			}
		}
		System.out.println(res);

	}

}
