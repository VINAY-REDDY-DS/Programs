package edu.jspiders.Arrays.TwoDimentionalArrays;

import java.util.Scanner;

public class ToGenarateIdentityMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Matrix");
		int size=sc.nextInt();
		int[][] a=new int[size][size];
		//int[][] a = MatrixUtil.initilizeMatrix();
		//MatrixUtil.printMatrix(a);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (i==j) {
					a[i][j]=1;
				}
			}
		}
		MatrixUtil.printMatrix(a);	
	}

}
