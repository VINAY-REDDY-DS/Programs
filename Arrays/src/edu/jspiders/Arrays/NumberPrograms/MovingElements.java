package edu.jspiders.Arrays.NumberPrograms;

public class MovingElements {
	public static void main(String[] args) {
		
		int[] a1 = { 7,0,1,5,0,8,0,4,0} ;
		int[] res = new int[a1.length];
		int resIndex = 0;
		
		for(int i=0; i< res.length; i++) {
			
			if(res[i] !=0)
			{
				res[resIndex]=res[i];
				resIndex++;
			}
		}
		System.out.println(res);
	}
}
