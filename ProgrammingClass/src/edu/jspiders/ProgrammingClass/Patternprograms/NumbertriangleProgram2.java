package edu.jspiders.ProgrammingClass.Patternprograms;
import java.util.Scanner;
public class NumbertriangleProgram2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns to print");
		int column = sc.nextInt();
		int num = 1;
		for (int row =1;row<=rows;row++)
		{
			for (int col=1;col<=column;col++)
			{
				if(num%2==0)
				System.out.print(1);
				else
				System.out.print(0);
				num++;
			}
			System.out.println();
			column++;
		}
	}

}