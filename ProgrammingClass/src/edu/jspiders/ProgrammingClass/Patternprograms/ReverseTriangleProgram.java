package edu.jspiders.ProgrammingClass.Patternprograms;
import java.util.Scanner;
public class ReverseTriangleProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns to print");
		int column = sc.nextInt();
		int space = rows-1;
		int content = 1;
		int num=1;
		char lch = 'a';
		char uch = 'A';
	
		for (int row =1;row<=rows;row++)
		{
			for (int sp=1;sp<=space;sp++)
			{
				System.out.print(" ");
			}
			for (int col=1;col<=content;col++)
			{
				if(num%2==0)
				System.out.print(lch++);
				else
				System.out.print(uch++);
				num++;
				
			}
			System.out.println();
			space--;
			content++;
		}
	}

}