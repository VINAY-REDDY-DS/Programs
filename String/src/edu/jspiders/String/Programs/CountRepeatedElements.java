package edu.jspiders.String.Programs;

public class CountRepeatedElements {

	public static void main(String[] args) {
		String s = "aabbbcdeeeeffdgggthhdggg";
//		String res = "";
//		
//		for(int i=0; i<s.length();i++) {
//			int count = 1;
//			while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1))
//			{
//				count++;
//				i++;
//			}
//			res=res+s.charAt(i);
//			res=res+count;
//		}
//		System.out.println(res);
//
//	}
	           //or
	//String s = "aaaabbbggttdddiittelll";
	
	for(int i=0; i<s.length(); i++) {
		int count =1;
		while(i<s.length()-1 && (s.charAt(i)==s.charAt(i+1))) {
			count++;
			i++;
		}
		System.out.println(s.charAt(i)+""+count);
	}
	}
}
