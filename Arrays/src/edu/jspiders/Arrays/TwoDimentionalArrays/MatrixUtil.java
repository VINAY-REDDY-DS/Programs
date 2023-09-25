package edu.jspiders.Arrays.TwoDimentionalArrays;

import java.util.Scanner;

public class MatrixUtil {
	
	public static int[][] initilizeMatrix()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row Size");
		int row = sc.nextInt();
		System.out.println("Enter Column Size");
		int column = sc.nextInt();
		
		
		int[][] a = new int[row][column];
		
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter the Element at " +i+ " and " +j+ " Index");
				a[i][j]=sc.nextInt();
			}
			
		}
		return a;
	}
	
	public static void printMatrix(int[][] a)
	{
		System.out.println("The Matrix Array are");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	
		
	

}
