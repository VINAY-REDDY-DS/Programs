package edu.jspiders.Arrays.TwoDimentionalArrays;

public class MatricRotation {
public static void main(String[] args) {
	int[][] a1 = MatrixUtil.initilizeMatrix();
	System.out.println("Original Array");
	MatrixUtil.printMatrix(a1);
	System.out.println();
	int[][] res=rotateBy90Deg(a1);
	System.out.println("90 deg Rotation");
	MatrixUtil.printMatrix(res);
	System.out.println();
	int[][] res180=rotateBy180Deg(a1);
	System.out.println("180 deg Rotation");
	MatrixUtil.printMatrix(res180);
	System.out.println();
	int[][] res270=rotateBy270Deg(a1);
	System.out.println("270 deg Rotation");
	MatrixUtil.printMatrix(res270);
	
}
public static int[][] rotateBy90Deg(int[][] a1)
{
	int[][] res = new int[a1.length][a1[0].length];
	for(int i=0;i<a1.length;i++) {
		int k=0;
		for(int j=a1.length-1;j>=0;j--) {
			res[i][k]=a1[j][i];
			k++;
		}
	}
	return res;
}
public static int[][] rotateBy180Deg(int[][] a1){
	int[][] res = rotateBy90Deg(a1);
	res=rotateBy90Deg(res);
	return res;

}
public static int[][] rotateBy270Deg(int[][] a1){
	int[][] res = rotateBy180Deg(a1);
	res=rotateBy180Deg(res);
	return res;

}
}
