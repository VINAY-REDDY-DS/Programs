package edu.jspiders.Arrays.NumberPrograms;

public class AdjecentPairs {
	public static void main(String[] args) {
		
		int[] arr = {10,7,8,25,9,27,11};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==1 || arr[i]-arr[j]==1)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
			
		}
	}

}
