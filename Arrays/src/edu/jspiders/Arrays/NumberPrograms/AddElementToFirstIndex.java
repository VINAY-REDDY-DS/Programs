package edu.jspiders.Arrays.NumberPrograms;

import java.util.Scanner;

public class AddElementToFirstIndex {
	
		public static void main(String[] args) {
		
		int[] arr = Program1.initilizeArray();
		
		System.out.println("Array Elements are");
		Program1.printArray(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the New Elements to be Added");
		int newElement=sc.nextInt();
		addFirst(arr,newElement);
		System.out.println();
		addLast(arr,newElement);
		System.out.println("Enter the INDEX Where Elements to be added");
		int Index=sc.nextInt();
		addIndex(arr,newElement,Index);
		}
		
		private static void addFirst(int[] arr, int newElement)
		{
			
			int[] newArr = new int [arr.length+1];
					newArr[0] = newElement;
					
			
			for(int i=0;i<arr.length;i++)
			{
				newArr[i+1]=arr[i];
			}
			//newArr[newArr.length-1]=newElement;
			System.out.println("Array after adding Element at First");
			Program1.printArray(newArr);
		}
		private static void addLast(int arr[],int newElement)
		{
			int[] newArr = new int [arr.length+1];
			newArr[0] = newElement;
			
	
			for(int i=0;i<arr.length;i++)
			{
				newArr[i+1]=arr[i];
			}
			newArr[newArr.length-1]=newElement;
			System.out.println("Array after adding Element at Last");
			Program1.printArray(newArr);
	
		}
		private static void addIndex(int arr[],int newElement, int Index)
		{
			int[] newArr = new int [arr.length+1];
			newArr[0] = newElement;
			
	
			for(int i=0;i<arr.length;i++)
			{
				newArr[i+1]=arr[i];
			}
			newArr[newArr.length-1]=newElement;
			System.out.println("Array after adding Element at Last");
			Program1.printArray(newArr);
	
		}
		
		
	

}
