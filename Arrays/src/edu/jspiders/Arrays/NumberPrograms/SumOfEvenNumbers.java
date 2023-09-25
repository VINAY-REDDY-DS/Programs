package edu.jspiders.Arrays.NumberPrograms;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		
		int[] arr = Program1.initilizeArray();
		
		System.out.println("Array Elements are");
		Program1.printArray(arr);
		
		System.out.println();
		System.out.println("Sum Of all Even Elements are");
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum = sum + (arr[i]);
			}
			
		}
		System.out.println(sum);
	
	}
}

