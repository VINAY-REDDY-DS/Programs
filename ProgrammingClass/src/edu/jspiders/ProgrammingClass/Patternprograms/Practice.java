package edu.jspiders.ProgrammingClass.Patternprograms;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns to print");
		int column = sc.nextInt();
	
		for (int i =1;i<=rows;i++)
		{
			for (int j=1;j<=column;j++)
			{
				System.out.print(i);
				
			}
			System.out.println();
		}
	
	}

}
