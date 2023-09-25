package edu.jspiders.Arrays.NumberPrograms;

public class AvgElementOfArrays {
	
	public static void main(String[] args) {
		
		int[] arr = Program1.initilizeArray();
		
		System.out.println("Array Elements are");
		Program1.printArray(arr);
		
		System.out.println();
		System.out.println("Sum  Of all Elements are");
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			
				sum = sum + (arr[i]);
			
		}
		
		System.out.println(sum);
		int avg = sum/arr.length;
		System.out.println("Average of Elements are ");
		System.out.println(avg);
	
	}

}
