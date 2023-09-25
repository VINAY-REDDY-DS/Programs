package edu.jspiders.Arrays.NumberPrograms;

public class ZigZagElements2 {
	public static void main(String[] args) {
		int[] arr1 = {10,2,30,4,5 };
		int[] arr2 = {6,70,8,90,10,15,41};
		
		int[] res = new int[arr1.length+arr2.length];
		
		int arr1Index=0;
		int arr2Index=0;
		int resIndex=0;
		
		while (arr1Index < arr1.length) 
		{
			
			res[resIndex] = arr1[arr1Index];
			resIndex++;
			arr1Index++;
			
			
		}
		while (arr2Index < arr2.length) 
		{
			res[resIndex] = arr2[arr2Index];
			resIndex++;
			arr2Index++;
			
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] +", ");
			
		}
		
	}

}
