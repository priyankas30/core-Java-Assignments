/* Q 13_a 13.	Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ]  */

import java.util.Scanner;
public class Q13a
{
	public static void main(String...a)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
	
		int greater=(num2 > num3) ?((num2 >num1) ? num2 :num1): ((num3 > num1) ? num3 : num1);
		System.out.println("Gretest number is : "+greater);
	}
}