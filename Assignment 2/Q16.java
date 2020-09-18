/*16.	Write a program to print table of any entered number using loop.*/

import java.util.Scanner;

	class Q16
	{
		public static void main(String...o)
		{
			Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter number");
			int n=sc.nextInt();
			for (int i=1;i<=10;i++)
			{
				System.out.println(n+ " * " +i+ " = " +n*i);
			}
		}
	}