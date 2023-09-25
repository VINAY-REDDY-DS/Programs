package edu.jspiders.String.Programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ReplaceDuplicateElements {
	public static void main(String[] args) {
		
		String s = "aabbbcdeeeeffdgggthhdggg";
		
		LinkedHashSet<Character> lh1 = new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++) {
			lh1.add(s.charAt(i));
		}
		System.out.println(lh1);
		
		Iterator<Character>itr = lh1.iterator();
		String res = "";
		while(itr.hasNext())
		{
			Character ch = (Character) itr.next();
			res= res + ch;
		}
		System.out.println(res);
	}
	  				//or
//			String s = "aaabbbbcccdddeee";
//			System.out.println(s);
//			
//			LinkedHashSet<Character> h1 = new LinkedHashSet<Character>();
//			for(int i=0; i<s.length(); i++) {
//				
//				h1.add(s.charAt(i));
//			}
//			System.out.println(h1);
//			
//			Iterator<Character> itr = h1.iterator();
//			while(itr.hasNext()) {
//				char res = itr.next();
//				System.out.print(res);
//			}

}
