package edu.jspiders.ProgrammingClass.Patternprograms;
import java.util.Scanner;
public class Pattern3d {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int rows = sc.nextInt();
		
		int space = rows-1;
		int content = 1;
	
	
		for (int row =1;row<=rows;row++)
		{
			for (int sp=1;sp<=space;sp++)
			{
				System.out.print(" ");
			}
			for (int col=1;col<=content;col++)
			{
				if(col==1 || row == rows || col == content)
					System.out.print(col);
					else
					System.out.print(" ");
			}
			System.out.println();
			space--;
			content=content+2;
		}
	}

}