package edu.jspiders.Arrays.TwoDimentionalArrays;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size");
	int size = sc.nextInt();
	int[][] a1 = new int[size][size];
	for (int i = 0; i < a1.length; i++) {
		for (int j = 0; j < a1[i].length; j++) {
			if (a1[i][j]==1) {
				
				System.out.println(a1[i][j]);
				
			}
			
		}
		
	}
}
}
