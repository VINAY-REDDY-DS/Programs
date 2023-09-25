package edu.jspiders.Arrays.NumberPrograms;

public class RepeatingElements2 {
	public static void main(String[] args) {
		
		int[] arr = {25,27,93,25,93,81};
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < arr.length; j++) 
			{
				
				if(arr[i] == arr[j])
					count++;
			}
		}
			if(count>1) {
			System.out.println(arr[i] +" is a Repeating element");
			}
						
	}
	}

