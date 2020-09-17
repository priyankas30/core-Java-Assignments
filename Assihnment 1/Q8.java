/*08 Write a program to find the simple interest. 
Take the principle amount, rate of interest and time from user using Scanner class.*/

import java.util.Scanner;
class Q8{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter principle amount");
		int amt=sc.nextInt();
		System.out.println("Enter rate of interest");
		double r=sc.nextDouble();
		System.out.println("Enter time");
		int t=sc.nextInt();
		
		double SI=(amt*r*t)/100;
		System.out.println("Simple interest is :" +SI);
	}
}