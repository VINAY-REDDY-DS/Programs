package edu.jspiders.Arrays.NumberPrograms;

public class NumberOfOccurence {
	public static void main(String[] args) {
		
		int[] arr = {25,27,93,25,93,81};
		
		for (int i = 0; i < arr.length; i++) 
		{
			int count = numberOfOccurence(arr,arr[i]);
			System.out.println(arr[0]+" is present for "+count+" times");
			
		}
				
				
	}
	public static int numberOfOccurence(int[ ] arr, int Element)
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(Element == arr[i])
				count++;
		}
		return count;
	}

}
