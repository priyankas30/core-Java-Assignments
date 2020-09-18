/*18.	Program to check whether number is prime or not*/

import java.util.*;
class Q18
{
	public static void main(String...s)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENter a number");
		int temp;
		boolean isprime=true;
		int num=sc.nextInt();
		for(int i=2;i<num/2;i++)
		{
			temp=num%i;
			if (temp==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println("not a prime number");
		}
	}
}