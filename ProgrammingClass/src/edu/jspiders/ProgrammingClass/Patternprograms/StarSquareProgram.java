package edu.jspiders.ProgrammingClass.Patternprograms;
import java.util.Scanner;
public class StarSquareProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns to print");
		int columns = sc.nextInt();

		
		char uch = 'A';
		char lch = 'a';
		for (int i=1;i<=rows;i++)
		{
			for (int a=1;a<=columns;a++)
			{
				if(a%2==0) 
				{
					System.out.print(lch++);
				}
				else 
				{
					System.out.print(uch++);
				}
				
			}
			System.out.println();
			columns++;
		}
		System.out.println();
	}

}
