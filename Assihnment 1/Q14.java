/* 14.	Program to check that entered year is a leap year or not.*/

import java.util.*;
public class Q14
{
	public static void main(String...p)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
	if(year%4==0 && year%100!=0 || year%400==0)
		{
		System.out.println("leap year");
		}
		else
			{
		
				System.out.println("Not a leap year");
			}
	}
}
		