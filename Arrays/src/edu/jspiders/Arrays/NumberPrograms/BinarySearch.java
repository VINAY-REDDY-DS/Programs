package edu.jspiders.Arrays.NumberPrograms;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr = {10,7,8,25,9,27,11};
		int element = 10;//add sorting code
		
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			int mid = ((start+end)/2);
			if (element == arr[mid]) {
				
				System.out.println("Data Present");
				break;
			}
			else if (element < arr[mid]) {
				
				end = mid-1;
				
			}
			else if (element > arr[mid]) {
				
				start = mid+1;
				
			}
		}
			if (start >= end) {
				
				System.out.println("Data is not Present");
			}
		
	}

}
