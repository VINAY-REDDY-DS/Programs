package edu.jspiders.Arrays.TwoDimentionalArrays;

public class IdentityMatrix {
	public static void main(String[] args) {
		int[][] a = MatrixUtil.initilizeMatrix();
		MatrixUtil.printMatrix(a);
		
		System.out.println(" Is a Principle Diagonal Element");
		
		int princElecount=0;
		int otherElecount=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (i==j) {
					if (a[i][j]==1) {
						princElecount++;
					}
				}
				else
				{
					if (a[i][j] ==0 ) {
						otherElecount++;
					}
				}
				
			}
		}
			
	}

}
