/* Q 13 13.	Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ]  */

import java.util.*;
public class Q13
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if ( num1 > num2 && num1 > num3)
		{
			System.out.println(num1+ " is greater");
		}
			else if(num2 > num3 && num2 > num1)
			{
				System.out.println(num2+ "is greater ");
			}
			else
			{
				System.out.println(num3+ "  is greater ");
			}
	}
}