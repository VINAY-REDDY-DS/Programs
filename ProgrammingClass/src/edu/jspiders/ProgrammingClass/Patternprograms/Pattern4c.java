package edu.jspiders.ProgrammingClass.Patternprograms;
import java.util.Scanner;
public class Pattern4c {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int rows = sc.nextInt();
		System.out.println("Enter number of column to print");
		int column = sc.nextInt();
		int num=1;
		int uch='A';
		int lch='a';
		for (int row =1;row<=rows;row++)
		{
			for (int col=1;col<=column;col++)
			{
				if(num%2==0)
				System.out.print(uch++);
				else
				System.out.print(lch++);
	
			}
			System.out.println();
			column--;
		}
	}

}