package edu.jspiders.ProgrammingClass.Patternprograms;
import java.util.Scanner;
public class Pattern5a {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");//enter 5
		int rows = sc.nextInt();
		System.out.println("Enter number of column to print");// enter 5
		int column = sc.nextInt();
		int content = rows;
		int space = 0;
		for (int row =1;row<=rows;row++)
		{
			for (int sp=1;sp<=space;sp++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=content;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			content--;
		}
	}

}