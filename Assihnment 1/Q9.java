/* 09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.*/

import java.util.Scanner;
public class Q9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Days");
		
		int day=sc.nextInt();
		
		int year=day/365;
		
		int month=day%365;
		
		int month_s=month/30;
		
		int day1= day%365;
		
		int day_s=day%30;
		
		System.out.println("Years :"+year+ "   months :"+month_s+ "   days are :"+day1);
	}
}