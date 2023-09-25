package edu.jspiders.Arrays.NumberPrograms;

import java.util.Scanner;

public class ArrayUtils {
	public static void main(String[] args) {
		 
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = read.nextInt();
		
		String [] arr = new String[size];
		
		System.out.println("Enter the index value");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index value of "+ (i+1));
			arr [i] = read.next();
		}
		
		System.out.println("All the values present in an Array");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
