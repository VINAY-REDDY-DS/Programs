package edu.jspiders.String.Programs;

public class ConvertSpaceToDoller {

	public static void main(String[] args) {
		String s = "I Love India";
		System.out.println(s);
		
		String res = s.replace(" ", "$");
		System.out.println(res);
		
		      //or
		
//		for(int i=0; i<s.length();i++) {
//			
//			if(s.charAt(i)== ' ') {
//				System.out.print("$");
//			}
//			else {
//				System.out.print(s.charAt(i));
//			}
//		}
		
		     //or
		
//		String res = "";
//		for(int i = 0; i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			
//			if(ch == ' ')
//			{
//				res = res + "$";     another method to do
//			}
//			else {
//				res = res +ch;
//			}
//		}
//		System.out.println(res);
		

	}

}
