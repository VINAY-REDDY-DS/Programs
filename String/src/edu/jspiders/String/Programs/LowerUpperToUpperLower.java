package edu.jspiders.String.Programs;

public class LowerUpperToUpperLower {
	public static void main(String[] args) {
	
				String s = "aaaAAbbBBbbccCCcdDddeEEEee";
				System.out.println(s);
				
				for(int i=0; i<s.length(); i++) {
					char ch = s.charAt(i);
					
					if(ch>='A' && ch<='Z') {
						
						char uch = (char)(ch+32);
						System.out.print(uch);
					}
					else if(ch>='a' && ch<='z') {
						char lch = (char)(ch-32);
						System.out.print(lch);
					}
		
				}
				System.out.println();
				
				//or 
				
				
				
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
			}
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}

}
