package edu.jspiders.Arrays.NumberPrograms;

public class MovingElements2 {
	public static void main(String[] args) {
		
		int[] a1 = {10,-10,50,-48,50,80,-44,66};
		int[] arr = new int[a1.length];
		int res=0;
		for(int i=0; i<a1.length;i++)
		{
			if(a1[i]>0)
			arr[res++] = a1[i];
		}
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]<0)
			{
				arr[res++]=a1[i];
			}
		}
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		
	}
	

}
