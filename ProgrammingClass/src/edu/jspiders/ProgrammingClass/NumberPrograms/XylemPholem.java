package edu.jspiders.ProgrammingClass.NumberPrograms;
import java.util.Scanner;

public class XylemPholem {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();

	int temp = num;

	int sumOfExtremeDigits = 0, sumOfMidDigits = 0;

	while (num != 0)
	{
		int rem = num%10;

		if (temp == num || num <= 9)
		{
			sumOfExtremeDigits += rem;
		}
		else 
		{
			sumOfMidDigits += rem;
		}
		num = num/10;
	}
		System.out.println("sumOfExtremeDigits are "+sumOfExtremeDigits);
		System.out.println("sumOfMidDigits are"+sumOfMidDigits);

		if (sumOfExtremeDigits==sumOfMidDigits)
		{
			System.out.println(temp+" is a XYLEM NUMBER");

		}
		else
		{
			System.out.println(temp+" is a PHLOEM NUMBER");
		}
	}

}
