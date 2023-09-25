package edu.jspiders.ProgrammingClass.Patternprograms;
import java.util.Scanner;
public class NumberSquareProgram2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int num = sc.nextInt();
		for (int row =1;row>=num;row--)
		{
			for (int column=num;column>=1;column--)
			{
				System.out.print(column);
			}
			System.out.println();
		}
	}

}