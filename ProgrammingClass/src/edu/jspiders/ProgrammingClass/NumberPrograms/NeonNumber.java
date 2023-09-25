package edu.jspiders.ProgrammingClass.NumberPrograms;
import java.util.Scanner;
/* A positive integer whose sum of digits of its square is equal to the
 * number itself is called neon number 
 * we will only get neon numbers between 0 to 100000. So, there is a 
 * probability that 1 trillion also includes 0,1,9 as the neon numbers*/

public class NeonNumber {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int square = num*num;
		
		
		while (square!=0) 
		{
			int lastdigit = square%10;
				sum = sum + lastdigit;
				square = square/10;
		}
		if (num==sum)
			System.out.println(num+" is a Neon Number");
		else
			System.out.println(num+" is not a Neon Number");
		
	}

}
