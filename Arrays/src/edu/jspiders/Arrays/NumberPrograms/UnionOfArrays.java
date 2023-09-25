package edu.jspiders.Arrays.NumberPrograms;

public class UnionOfArrays {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50 };
		int[] arr2 = {60,70,80,90,100};
		
		int[] res = new int[arr1.length+arr2.length];
		int j=0;
		for (int i = 0; i < res.length; i++) {
			if(i < arr1.length)
			{
				res[i]=arr1[i];
			}
			else
			{
				res[i]=arr2[j++];
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
	
	}
}
