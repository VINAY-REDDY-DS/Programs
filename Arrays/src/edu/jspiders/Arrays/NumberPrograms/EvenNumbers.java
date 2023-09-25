
package edu.jspiders.Arrays.NumberPrograms;

public class EvenNumbers {
	public static void main(String[] args) {
		
		int[] arr = Program1.initilizeArray();
		
		System.out.println("Array Elements are");
		Program1.printArray(arr);
		
		System.out.println();
		System.out.println("Even Elements are");
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]%2==0)
			{
				
				System.out.print(arr[i]);
			}
	}
	
	}

}
