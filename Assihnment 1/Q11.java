/*11.	Write a program to swap two numbers without using third variable.*/

import java.util.Scanner;
public class Q11{
	public static void main (String...args)
	
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter two numbers");
	
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Before swapping :"+num1+ " " +num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping : " +num1+ " " +num2);
	}
}