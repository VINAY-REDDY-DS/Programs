package edu.jspiders.ProgrammingClass.NumberPrograms;
import java.util.Scanner;

/*A number is called automorphic if and only if the square of a given number
 * ends with the same number itself. for example 25 and 76 are automorphic
 * numbers because their square is 625 and 5776 respetively and the
 * last two digit of the square represents the number itself
 * ex:- 5,6,25,76, etc*/

public class AutomorphicNumber {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int Square = num*num;
		int numberOfDigits = findNumberOfDigits(num);

		/*int lastdigit = 1;
		if (numberOfDigits==1)
		{
			lastdigit = Square%10;
		}
		else if (numberOfDigits==2)
		{
			lastdigit = Square%100;
		}
		else if (numberOfDigits==3)
		{
			lastdigit = Square%1000;
		}

		if (lastdigit==num)
		{
			System.out.println(num+" is a AutomorphicNumber");
		}
		else
		{
			System.out.println(num+" is not a AutomorphicNumber");
		}
		           (or)*/


		String res = "";
		for (int i=1;i<=numberOfDigits ;i++ )
		{
			int rem = Square%10;
				res = rem + res;
				Square = Square/10;
		}
		int lastdigit = Integer.parseInt(res);

		if (lastdigit==num)
		{
			System.out.println(num+" is a AutomorphicNumber");
		}
		else
		{
			System.out.println(num+" is not a AutomorphicNumber");
		}
	}

		public static int findNumberOfDigits(int num)
		{
			int count = 0;

			while (num!=0)
			{
				num=num/10;
				count++;

			}
			return count;
		}

}
