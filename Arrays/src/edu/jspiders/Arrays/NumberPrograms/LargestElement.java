package edu.jspiders.Arrays.NumberPrograms;

import java.util.Arrays;

public class LargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {10,50,8,200,60,0};
		Arrays.sort(arr);
		System.out.println("Largest element is "+ arr[arr.length-1]);

}
}
