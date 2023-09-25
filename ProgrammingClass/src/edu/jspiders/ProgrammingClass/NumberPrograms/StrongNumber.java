package edu.jspiders.ProgrammingClass.NumberPrograms;
import java.util.Scanner;

/* Strong number are the special number ...., when we add the factorial of indiviual 
 * number of a given number that sld be equal to the given number
 * ex- 145 = 1! + 4! + 5! = 145
 * 1!=1
 * 4!=24
 * 5!=120
 * 1+24+120 = 145*/

public class StrongNumber {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number");
		int num=sc.nextInt();
		//System.out.println("enter a number");
		//int lastdigit=sc.nextInt();

		for (int j = 1;j<=num ;j++ )
		{
		
			for (int i=1;i<=num ;i++ )
			{

				int temp = num;
				int sum = 0;

				while(num!=0)
				{
					int rem = num%10;
					int fact = factorial(rem);
					System.out.println(rem+" != "+fact);
					sum=sum+fact;
					num=num/10;
				}
				System.out.println("Sum of factorial = "+sum);
				if (temp == sum)
				{
					System.out.println(temp+" is a strong number");
				}
				else 
				{
					System.out.println(temp+" is not a strong number");
				}
			}
		}
	}
	public static int factorial(int num)
	{
		int res = 1;
		while (num !=1)
		{
			res = res*num;
			num--;
		}
		return res;
	}


}
 