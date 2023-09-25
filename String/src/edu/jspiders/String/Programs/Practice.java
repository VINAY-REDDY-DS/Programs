package edu.jspiders.String.Programs;


public class Practice {

	public static void main(String[] args) {
		
		int arr[] = {150,-6};
		//Array Elements before soting
		System.out.println("Elements present in an Array is : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}

		//Sorting the Array
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//Printing the sorted Elements
		System.out.println("\nSorted Elements of an Array : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
		
}
