package edu.jspiders.Arrays.NumberPrograms;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
		int[] arr = initilizeArray();
		
		printArray(arr);
	}
	
	public static int[] initilizeArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Enter the Index value of Array ["+i+"]");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] a)
	{
		
		for (int i = 0; i < a.length; i++) {
			
				System.out.print(a[i]+" , ");
		}
		
	}

}
